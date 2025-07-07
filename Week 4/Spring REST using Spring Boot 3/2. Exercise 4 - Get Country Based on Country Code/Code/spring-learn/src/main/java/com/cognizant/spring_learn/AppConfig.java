package com.cognizant.spring_learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Country countryIN(){
        return new Country("IN", "India");
    }
    @Bean
    public Country countryJP(){
        return new Country("JP", "Japan");
    }
    @Bean
    public Country countryUS(){
        return new Country("US", "United States");
    }
}
