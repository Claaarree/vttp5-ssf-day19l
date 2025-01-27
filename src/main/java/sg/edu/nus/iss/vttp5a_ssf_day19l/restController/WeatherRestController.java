package sg.edu.nus.iss.vttp5a_ssf_day19l.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.vttp5a_ssf_day19l.service.WeatherRestService;

@RestController
@RequestMapping("/api/weather")
public class WeatherRestController {
    
    @Autowired
    WeatherRestService weatherRestService;

    @GetMapping
    public ResponseEntity<String> getWeatherData() {
       return weatherRestService.getWeatherData();
    }
}
