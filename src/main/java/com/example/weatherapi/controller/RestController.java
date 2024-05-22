package com.example.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.weatherapi.service.TempComparisionService;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    TempComparisionService tempComparisionService;

    @GetMapping("rs/bestweather")
        public Object displayBestWeather (){
        return tempComparisionService.displayBestWeather();
    }

}
