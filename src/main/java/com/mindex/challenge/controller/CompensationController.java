package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {

    @Autowired
    private CompensationService compensationService;
    @PostMapping("/compensation")
    public Compensation create(@RequestBody Compensation compensation) {

        return compensationService.create(compensation);
    }
    @GetMapping("/compensation/{id}")
    public Compensation read(@PathVariable String id) {

        return compensationService.read(id);
    }
}
