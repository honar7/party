package com.raman.party.mapper;

import com.raman.party.dto.PartyDto;
import com.raman.party.model.Party;

public class PartyMapper {
    public static PartyDto toPartyDto(Party party){
        return new PartyDto();
    }
}
