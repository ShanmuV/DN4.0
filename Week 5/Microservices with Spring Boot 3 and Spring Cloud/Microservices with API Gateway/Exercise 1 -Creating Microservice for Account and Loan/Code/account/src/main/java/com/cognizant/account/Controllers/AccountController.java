package com.cognizant.account.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @GetMapping("/{id}")
    public Map<String, Object> getAccountInfo(@PathVariable String id){
        return Map.of("number",12345678, "type", "savings", "balance", 234343);
    }
}
