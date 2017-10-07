package com.PdfProcess.controller;


import com.PdfProcess.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Balaji on 7/10/17.
 */
@Controller
public class AutoBioController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class.getName());
    @RequestMapping("/autobio")
    public String autoBio(Model model){
        LOGGER.info("Entering autoBio...");
        Person person=new Person("Balaji Sundaram", 25, "Java Developer");
        model.addAttribute("p", person);
        return "AutoBio";
    }
}
