package io.nikoden.firstjourney.controller;

import io.nikoden.firstjourney.dto.PersonDto;
import io.nikoden.firstjourney.model.Person;
import io.nikoden.firstjourney.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/test")
    public String testEndpoint() {
        return "API is running";
    }

    @PostMapping
    public Person createPerson(@RequestBody PersonDto personDto) {
        Person person = new Person();
        person.setName(personDto.getName());
        person.setAge(personDto.getAge());
        return personService.createPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody PersonDto personDto) {
        return personService.updatePerson(id, personDto);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }
}
