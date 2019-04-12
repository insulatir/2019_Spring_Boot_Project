package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private final String names = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name";
    private final ParameterizedTypeReference<List<String>> responseType = new ParameterizedTypeReference<List<String>>() {};

    
}
