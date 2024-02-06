package com.tryquiz.exam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(){

 return "login";
}

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String login(@RequestParam String email,@RequestParam String password ){
        if(email.equals("admin")&&password.equals("admin")){
            return "about";

        }
        return "login";
    }
}