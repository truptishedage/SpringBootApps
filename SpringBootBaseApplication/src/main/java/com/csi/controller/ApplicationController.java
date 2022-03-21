package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @GetMapping
    public  String sayWelcome()
    {
        return "Welcome To Fintech CSI ";
    }
    @GetMapping("/address")
    public  String sayAddress()
    {
        return "INSPIRIA Mall| Pune";
    }

    @GetMapping("/services")
    public  String sayService()
    {
        return "SOFTWARE DEVELOPMENT | QR CODE";
    }
}
