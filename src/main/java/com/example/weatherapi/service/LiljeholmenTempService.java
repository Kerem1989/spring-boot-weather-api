package com.example.weatherapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.weatherapi.entity.met.LiljeholmenTempMet;
import com.example.weatherapi.entity.met.METResponseEntity;
import com.example.weatherapi.entity.open_meteo.LiljeholmenTempMeteo;
import com.example.weatherapi.entity.open_meteo.MeteoResponseEntity;
import com.example.weatherapi.entity.smhi.LiljeholmenTempSMHI;
import com.example.weatherapi.entity.smhi.SmhiResponseEntity;

@Service
public class LiljeholmenTempService {

    @Autowired
    LiljeholmenTempMet liljeholmenTempMet;
    @Autowired
    LiljeholmenTempSMHI liljeholmenTempSMHI;
    @Autowired
    LiljeholmenTempMeteo liljeholmenTempMeteo;


    public METResponseEntity getLiljeholmenTempFromMet() {
        return liljeholmenTempMet.getTemp();
    }

    public SmhiResponseEntity getLiljeholmenTempFromSMHI(){
        return liljeholmenTempSMHI.getTemp();
    }

    public MeteoResponseEntity getLiljeholmenTempFromOpenMeteo(){
        return liljeholmenTempMeteo.getTemp();
    }



}
