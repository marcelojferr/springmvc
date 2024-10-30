package com.javaproject.customer.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javaproject.customer.springmvc.model.Person;
import com.javaproject.customer.springmvc.service.PersonService;


@RequestMapping("/person")
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "index";
    }

    @GetMapping("/add")
    public String addPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "add-person";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute Person person) {
        personService.savePerson(person);
        return "redirect:/";
    }
}
