package com.raman.party.controller;

import com.raman.party.exception.PartyNotFoundException;
import com.raman.party.model.Party;
import com.raman.party.service.PartyService;
import com.raman.party.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    PartyService service;

    @Autowired
    PartyRepository partyRepository;

    public PartyController() {
    }

    @GetMapping("/parties")
    public List<Party> getParties(){
        return partyRepository.findAll();
    }

    @GetMapping("/parties/{id}")
    public Party getParty(@PathVariable long id ) throws PartyNotFoundException {
        Optional<Party> party=partyRepository.findById(id);
        if(!party.isPresent())
            throw new PartyNotFoundException("id-"+id);
        return party.get();
    }

    @DeleteMapping("/parties/{id}")
    public void deleteParty(@PathVariable long id ) {
        partyRepository.deleteById(id);
    }

    @PostMapping("/parties")
    public ResponseEntity<Object> createParty(@RequestBody Party party){
        Party savedParty=partyRepository.save(party);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedParty.getId()).toUri();
        return  ResponseEntity.created(location).build();
    }

    @PutMapping("/parties/{id}")
    public  ResponseEntity<Object> updateParty(@RequestBody Party party,@PathVariable long id){
        Optional<Party> partyOptional = partyRepository.findById(id);
        if(!partyOptional.isPresent())
            return ResponseEntity.notFound().build();
        party.setId(id);
        partyRepository.save(party);
        return  ResponseEntity.noContent().build();
    }



}
