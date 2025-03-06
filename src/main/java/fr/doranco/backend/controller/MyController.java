package fr.doranco.backend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${api-key}")
    private String apiKey;

    @GetMapping("api/{name}")
    public String hello(@PathVariable String name) {
        return "Hello no  " + name;
    }

    @GetMapping("api-key")
    public String getApiKey() {
        return apiKey + " from controller";
    }
}
