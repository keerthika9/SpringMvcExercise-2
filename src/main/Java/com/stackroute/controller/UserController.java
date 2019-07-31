package com.stackroute.controller;

import com.stackroute.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//indicates that a particular class serves the role of a controller
public class UserController {
  @RequestMapping("/")//This annotation maps HTTP requests to handler methods of MVC
  public String returnMessage() {
    return "index";
  }
  @RequestMapping("/login")
    public ModelAndView display() {
      User user = new User();
      user.setName("keer");
      ModelAndView modelAndView = new ModelAndView("display");
      modelAndView.addObject("username", user.getName() );
      return modelAndView;
    }
  }
