package com.richand.bot.customersupportbot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceBotController {
    private CustomerServiceBot bot = new CustomerServiceBot();

    @GetMapping("/answer")
    public String getAnswer(@RequestParam String question) {
        return bot.getAnswer(question);
    }
}
