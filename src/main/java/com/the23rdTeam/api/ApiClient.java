package com.the23rdTeam.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.http.HttpMethod.*;

@Service
public class ApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private final String names = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name";
    private final ParameterizedTypeReference<List<String>> responseType = new ParameterizedTypeReference<List<String>>() {};

    public List<String> getNames() {
        List<String> responseBody = (List<String>) restTemplate.exchange(names, GET, null, responseType);
        return responseBody;
    }
}
