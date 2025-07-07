package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.springframework.web.bind.annotation.RequestHeader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String header){
        String encodedHeader = header.substring("Basic ".length());
        String username = getUsername(encodedHeader);
        String token = generateToken(username);

        Map<String, String> response = new HashMap<String, String>();
        LOGGER.debug("User Logged in. Token Issued: {}",token);
        response.put("token",token);
        return response;
    }

    public String getUsername(String header){
        byte[] decodedBytes = Base64.getDecoder().decode(header);
        String decodedString = new String(decodedBytes);
        LOGGER.debug("Decoded String: {}", decodedString);
        return decodedString.split(":")[0];
    }

    public String generateToken(String username){
        Date now = new Date();
        Date expiry = new Date(now.getTime() + 60*60 * 1000);
        return Jwts.builder().setSubject(username).setIssuedAt(now).setExpiration(expiry).signWith(Keys.hmacShaKeyFor("abcdefghijklmnopqrstuvwxyzabcdef".getBytes()), SignatureAlgorithm.HS256).compact();
    }
}
