package com.example.demospring.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void addNewPerson(@RequestBody Person person) {
        System.out.println(person);
    }

    public List<Person> getPerson(){
        return personRepository.findAll();
    }


   /*public void addNewPerson(Person person){
       System.out.println(person);
   }*/
}
/*
List.of( new Person()
 */