package com.javaproject.customer.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaproject.customer.springmvc.model.Person;
import com.javaproject.customer.springmvc.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
