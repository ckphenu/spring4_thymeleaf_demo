package com.intel.dadi.thymeleaf.demo.stsm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ecic Chen on 2015/12/14.
 */
@Controller
public class TestThymeleafController {

    @RequestMapping(value = "testThymeleaf")
    public String testController(Model model){
        model.addAttribute("testHello","testHello");
        return "testThymeleaf";
    }
}
