package com.lgdelacruz.pizzaapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PizzaOrderController {

    @GetMapping("/")
    public String getView(Model model) {
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        return "index.jsp";
    }

}