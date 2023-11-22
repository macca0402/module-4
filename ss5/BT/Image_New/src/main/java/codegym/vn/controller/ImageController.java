package codegym.vn.controller;

import codegym.vn.entity.Image;
import codegym.vn.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;
    @GetMapping("/list")
    public String display(Model model){
        model.addAttribute("image",new Image());
        return "/list";
    }
    @PostMapping("/create")
    public String createComment(@ModelAttribute Image image,Model model){
        imageService.createComment(image);
        model.addAttribute("message","Đã comment");
        return "/list";

    }
}
