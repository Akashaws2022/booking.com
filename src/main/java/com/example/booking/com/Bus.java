package com.example.booking.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Bus {

    @GetMapping("/Bu" +
            "s")
    public String getData() {
        return ("Click here for RLB Booking");
    }
}