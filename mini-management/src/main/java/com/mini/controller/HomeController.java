package com.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(){
        return "index";
    }


    //Login route or page
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

//Admin Route
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }




    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }




}
