package com.raman.party.controller;

import com.raman.party.exception.PartyNotFoundException;
import com.raman.party.model.Party;
import com.raman.party.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    PartyService service;

    public PartyController() {
    }

    @GetMapping("/parties")
    public List<Party> getParties(){
        return service.getParties();
    }


    @GetMapping("/parties/{id}")
    public Party getParty(@PathVariable long id ) throws PartyNotFoundException {
        return service.getParty(id);
    }

    @DeleteMapping("/parties/{id}")
    public void deleteParty(@PathVariable long id ) {
        service.removeParty(id);
    }

    @PostMapping("/parties")
    public ResponseEntity<Party> createParty(@RequestBody Party party){
        return service.createParty(party);
    }

    @PutMapping("/parties/{id}")
    public  ResponseEntity<Party> updateParty(@RequestBody Party party,@PathVariable long id){
       return  service.updateParty(party,id);
    }



}
