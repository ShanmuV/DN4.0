package com.cognizant;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;
    
    public Country(){
        LOGGER.debug("Inside Country Constructor");
    }

    public String getCode(){
        LOGGER.debug("Code getter called!");
        return code;
    }

    public String getName(){
        LOGGER.debug("Name getter called");
        return name;
    }

    public void setCode(String code){
        LOGGER.debug("Code setter called!");
        this.code = code;
    }

    public void setName(String name){
        LOGGER.debug("Name setter called");
        this.name = name;
    }

    @Override
    public String toString(){
        return "Country Code: "+this.code+", Country Name: "+this.name;
    }
}
