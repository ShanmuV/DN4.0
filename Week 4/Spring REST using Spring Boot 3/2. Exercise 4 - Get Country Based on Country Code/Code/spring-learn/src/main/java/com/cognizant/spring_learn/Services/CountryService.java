package com.cognizant.spring_learn.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

import java.util.Map;

@Service
public class CountryService {
    @Autowired
    Map<String, Country> countries;

    public Country getCountry(String code){
        code = code.toUpperCase();
        for(Country k : countries.values()){
            if(code.equals(k.code)) return k;
        }
        return null;
    }

}
