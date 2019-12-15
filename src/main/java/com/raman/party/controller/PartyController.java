package com.raman.party.controller;

import com.raman.party.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    PartyService service;

    public PartyController() {
    }

}
