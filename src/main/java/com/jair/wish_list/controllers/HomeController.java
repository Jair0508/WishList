package com.jair.wish_list.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("")
  public String homepage() {
    return "home.jsp";
  }
  
}
