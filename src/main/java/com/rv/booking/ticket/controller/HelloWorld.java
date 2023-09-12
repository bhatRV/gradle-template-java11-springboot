package com.rv.booking.ticket.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/v1/say/")
public class HelloWorld {

    @GetMapping("hello")
    public String sayhello()
    {
        return "Hello from Rashmi";
    }



}