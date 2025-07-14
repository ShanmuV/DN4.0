package com.cognizant.loan.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {
    @GetMapping("/{id}")
    public Map<String, Object> getLoanDetails(@PathVariable String id){
        return Map.of("number", "H00987987972342", "type", "car", "loan", 40000, "emi",3258, "tenure", 18);
    }
}
