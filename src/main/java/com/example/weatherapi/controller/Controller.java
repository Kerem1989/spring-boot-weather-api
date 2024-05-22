package com.example.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.weatherapi.entity.met.METResponseEntity;
import com.example.weatherapi.entity.open_meteo.MeteoResponseEntity;
import com.example.weatherapi.entity.smhi.SmhiResponseEntity;
import com.example.weatherapi.service.LiljeholmenTempService;
import com.example.weatherapi.service.TempComparisionService;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    TempComparisionService tempComparisionService;

    @Autowired
    LiljeholmenTempService liljeholmenTempService;

    @GetMapping("bestweather")
    public String displayWeather(Model model) {
        Object displayWarmestWeather = tempComparisionService.displayBestWeather();
        model.addAttribute("displayWarmestWeather", displayWarmestWeather);
        return "weatherpage";
    }

    @GetMapping("weatherSMHI")
    public String displayWeatherFromSMHI (Model model) {
        SmhiResponseEntity displayWeatherSmhi = liljeholmenTempService.getLiljeholmenTempFromSMHI();
        model.addAttribute("displayWarmestWeather", displayWeatherSmhi);
        return "weatherpage";
    }

    @GetMapping("weatherMET")
    public String displayWeatherFromMet (Model model) {
        METResponseEntity displayWeatherMet = liljeholmenTempService.getLiljeholmenTempFromMet();
        model.addAttribute("displayWarmestWeather", displayWeatherMet);
        return "weatherpage";
    }

    @GetMapping("weatherMETEO")
    public String displayWeatherFromMeteo (Model model) {
        MeteoResponseEntity displayWeatherMeteo = liljeholmenTempService.getLiljeholmenTempFromOpenMeteo();
        model.addAttribute("displayWarmestWeather", displayWeatherMeteo);
        return "weatherpage";
    }


}

