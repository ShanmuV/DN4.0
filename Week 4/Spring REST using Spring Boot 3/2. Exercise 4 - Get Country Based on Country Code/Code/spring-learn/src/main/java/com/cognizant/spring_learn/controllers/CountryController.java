package com.cognizant.spring_learn.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.Services.CountryService;;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    public CountryService countryService;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }
}
