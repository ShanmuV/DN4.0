package com.cognizant.spring_learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// Im using the Annotation style instead of XML config, because I heard that xml-config style is outdated
@Component
public class Country {
    @Value("JP")
    public String code;

    @Value("Japan")
    public String name;
}
