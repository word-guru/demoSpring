package com.example.demospring.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/person")
public class PersonController {

    private final PersonService personService;

    @Autowired //@Component,@Service
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPerson(){
        return personService.getPerson();
    }

    @PostMapping
    public void registeredNewPerson(Person person){
        PersonService.addNewPerson(person);
    }
}
