package com.cognizant.spring_learn.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.spring_learn.Country;;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    public Country country;

    @GetMapping
    public Country getCountry(){
        return this.country;
    }
}
