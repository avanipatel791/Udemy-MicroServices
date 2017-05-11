package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${luckyword}") String luckyWord;

	  @RequestMapping("/luckyword")
	  public String showLuckyWord() {
	    return "The lucky word is: " + luckyWord;
	  }
}
