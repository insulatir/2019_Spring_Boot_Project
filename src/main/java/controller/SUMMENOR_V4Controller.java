package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol/summoner/v4/summoners")
public class SUMMENOR_V4Controller {
    @GetMapping("/lol/summoner/v4/summoners/by-name/{summonerName}")
    
}

