package com.example.demo.controllerFolder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    @GetMapping("/open")
    public String open(){

        return "greeter";
    }
    @RequestMapping("/greet")
    public String formDone( @RequestParam(value = "sentence", required = false) String value, Model model){

        model.addAttribute("greeting",value);
        return "greeter";
    }

}
