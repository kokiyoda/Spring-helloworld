package com.koki.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController

public class HelloworldController {

    @GetMapping("/localTime")
    public String localTime() {
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formatted = dateFormat.format(localTime);
        return "Hello current time " + formatted;

    }

}
