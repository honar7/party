package com.raman.party.service;

import com.raman.party.exception.PartyNotFoundException;
import com.raman.party.model.Party;
import com.raman.party.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@Component
public class PartyService {

    @Autowired
    private PartyRepository partyRepository;

    public PartyService() {
    }

    public Party getParty(long id) throws PartyNotFoundException {
        Optional<Party> party=partyRepository.findById(id);
        if(!party.isPresent())
            throw new PartyNotFoundException(MessageFormat.format( "Party Id = {0} Is Not Found :( ",id) );
        return party.get();
    }
    public List<Party> getParties(){
        return partyRepository.findAll();
    }


    public ResponseEntity<Party>  createParty(Party party){
        Party savedParty = partyRepository.save(party);
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedParty.getId()).toUri();
        return  ResponseEntity.created(location).build();
    }
    public ResponseEntity<Party>  updateParty(Party party,long id){
        Optional<Party> partyOptional = partyRepository.findById(id);
        if(!partyOptional.isPresent())
            return ResponseEntity.notFound().build();
        party.setId(id);
        partyRepository.save(party);
        return  ResponseEntity.noContent().build();
    }

    public void removeParty(long id ) {
        partyRepository.deleteById(id);
    }

}
