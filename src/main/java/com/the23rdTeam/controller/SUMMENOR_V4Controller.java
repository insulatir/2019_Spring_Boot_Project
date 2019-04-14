package com.the23rdTeam.controller;

import com.the23rdTeam.repository.SUMMERNOR_V4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol/summoner/v4/summoners")
public class SUMMENOR_V4Controller {
    @Autowired
    private SUMMERNOR_V4Repository summernor_v4Repository;

    @GetMapping("/lol/summoner/v4/summoners/by-name/{summonerName}")
    public String getIdByName(@PathVariable String summonerName) {
        return summernor_v4Repository.findIdByName(summonerName);
    }
}

