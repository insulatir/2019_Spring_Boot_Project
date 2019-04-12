package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SUMMENOR_V$Service;

@RestController
@RequestMapping("/lol/summoner/v4/summoners")
public class SUMMENOR_V4Controller {
    @Autowired
    private SUMMENOR_V$Service summenor_v$Service;

    @GetMapping("/lol/summoner/v4/summoners/by-name/{summonerName}")
    public String getIdByName(@PathVariable String name) {
        return summenor_v$Service.getIdByName(name);
    }
}

