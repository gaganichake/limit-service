package com.gagan.microservices.limitservice.controller;

import com.gagan.microservices.limitservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(1, 10000);
    }
}
