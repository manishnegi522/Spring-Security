package com.SpringSecurityJuneProject.JWTSecurity.Controller;

import com.SpringSecurityJuneProject.JWTSecurity.Entity.user;
import com.SpringSecurityJuneProject.JWTSecurity.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController // To create RestApis we use RestController // in wich we Send the Data into Json Format
@RequestMapping ("/home") // to bind the method to Url
public class HomeController {

    @Autowired
    private userService userService ;


//http://localhost:8080/home/users
    @GetMapping("/users")
    public List<user> user() {

        List<user> user = userService.getUser();
return user ;

    }

    @GetMapping ("/currentUser")
    public String currentUser (Principal principal) {
        String currentLogin = principal.getName();
        return currentLogin ;
    }


}
