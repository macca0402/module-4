package org.example.controller;

import org.example.entity.Image;
import org.example.repository.impl.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageOfDayController {
    @Autowired
    public ImageRepo imageRepo;
    @GetMapping("/index")
    public String display(Model model){
//        model.addAttribute("image",new Image());
////        model.addAttribute("valueComment",5);
////        model.addAttribute("valueGreat",5);
        return "/index";
    }
    @PostMapping("/comment")
    public String createComment(@ModelAttribute Image image){
        imageRepo.create(image);
        return "/index";

    }
}
