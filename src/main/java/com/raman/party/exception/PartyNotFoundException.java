package com.raman.party.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PartyNotFoundException extends Throwable {

    public PartyNotFoundException(){
        super();
    }

    public  PartyNotFoundException(String exception) {
        super(exception);
    }

    public  PartyNotFoundException(Throwable exception) {
        super(exception);
    }
}
