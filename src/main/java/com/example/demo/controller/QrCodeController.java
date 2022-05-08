package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@ResponseBody
public class QrCodeController {
	
	@GetMapping("/toQrCode")
	public ModelAndView toQrCode(){
        ModelAndView modelAndView = new ModelAndView("qrCode");
        return modelAndView;
    }
	
	
	@GetMapping("/toHome")
	public ModelAndView toHomePage(){
        ModelAndView modelAndView = new ModelAndView("homePage");
        return modelAndView;
    }

}
