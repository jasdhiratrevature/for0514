package com.revature.spring.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("sunny")
public class SunnyDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is sunny day!";
    }

}
