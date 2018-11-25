package com.controller;

import com.entity.User;
import com.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping (value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm (){
        return "register";
    }


    //jsp sends null. doesn't create User
    @RequestMapping (value = "/register", method = RequestMethod.POST)
    public String processRegistration (User user){
        userRepository.addNewUser(user);
        return "redirect:/home/" + user.getUsername();
        //return "home";
    }

    //this method is the same as previous, but user is added manually
    /*@RequestMapping (value = "/register", method = RequestMethod.POST)
    public String processRegistration (User user1) {
        User user = new User("olena", "andrushchenko", "any", "2345");
        userRepository.addNewUser(user);
        return "redirect:/home/" + user.getUsername();
    }*/

    //doesn't pass username to repository!!! Why?
    @RequestMapping (value = "/home/{username}", method = RequestMethod.GET)
    public String showUserProfile (@PathVariable String username, Model model){
        User user = userRepository.findByUsername(username);
        model.addAttribute(user);
        return "profile";
    }

    @RequestMapping (value = "/profile", method = RequestMethod.GET)
    public String showProfile (){
        return "profile";
    }

}
