package sg.edu.nus.iss.vttp5a_ssf_day19l.service;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import sg.edu.nus.iss.vttp5a_ssf_day19l.constant.Constant;

@Service
public class WeatherRestService {
    
    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getWeatherData() {
        String url = UriComponentsBuilder
                .fromUriString(Constant.weatherURl)
                .queryParam("key", Constant.apiKey)
                .queryParam("q", "London")
                .queryParam("aqi", "no")
                .toUriString();
        
        RequestEntity<Void> req = RequestEntity.get(url).build();

        ResponseEntity<String> res = restTemplate.exchange(req, String.class);

        return res;
    }
}
