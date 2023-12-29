package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class HomeController {
    record Video(String name) {}
    List<Video> videos = List.of(
            new Video("Need HELP with your Spring Boot 3 App?"),
            new Video("Don't do THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!"));
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("videos", videos);
        return "index";
   }
}
