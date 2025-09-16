package com.lakshman.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${app.number}")
    private int Number;
    @RequestMapping("/")
    public String index() {
        System.out.println(Number);
        return "index.html";
    }
}
