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
 * Created by Balaji on 6/10/17.
 */
@Controller
public class WelcomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class.getName());
    @RequestMapping("/")
    public String welcome(Model model){
        /*LOGGER.info("Entering welcome page !!!");
        Person person1=new Person("Balaji",22);
        Person person2=new Person("vvvvvvvvi",22);
        Person person3=new Person("ppp",22);
        Map<String, Person> persons=new HashMap<>();
        persons.put("Mech",person1);
        persons.put("ECE",person2);
        persons.put("ECE",person3);
        model.addAttribute("persons", persons);*/
        return "test";
    }
}
