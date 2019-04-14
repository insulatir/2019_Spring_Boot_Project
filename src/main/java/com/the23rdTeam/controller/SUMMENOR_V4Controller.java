package com.the23rdTeam.controller;

import com.the23rdTeam.service.SUMMERNOR_V4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol/summoner/v4/summoners")
public class SUMMERNOR_V4Controller {
    @Autowired
    private SUMMERNOR_V4Service summenor_v$Service;

    @GetMapping("/lol/summoner/v4/summoners/by-name/{summonerName}")
    public String getIdByName(@PathVariable String name, @PathVariable String summonerName) {
        return summenor_v$Service.getIdByName(name);
    }
}

