package org.example.controller;

import org.example.service.SandwichIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @Autowired
    private SandwichIService service;
    @GetMapping("/list")
    public String listOption(Model model){
        model.addAttribute("list",service.findAll());
        return "sandwich/list";
    }
    @GetMapping("/test")
    public String showTest(){
        return "sandwich/test";
    }
}
