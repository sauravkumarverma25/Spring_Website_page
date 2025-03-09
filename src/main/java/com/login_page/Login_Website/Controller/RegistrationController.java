package com.login_page.Login_Website.Controller;

import com.login_page.Login_Website.Model.MyAppUser;
import com.login_page.Login_Website.Repository.MyAppuserrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class RegistrationController {

    @Autowired
    private MyAppuserrepository myAppuserrepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/req/signup", consumes = "application/json")
    public MyAppUser createuser(@RequestBody MyAppUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return myAppuserrepository.save(user);
    }


}
