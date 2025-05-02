package io.michaeljgkopp.github.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/home")
    public String home() {
        return "Congrats! You have successfully deployed this Spring application in AWS.";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "This is the about us page...";
    }
}