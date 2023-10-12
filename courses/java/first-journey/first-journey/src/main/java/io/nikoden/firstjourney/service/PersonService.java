package io.nikoden.firstjourney.service;

import io.nikoden.firstjourney.dto.PersonDto;
import io.nikoden.firstjourney.model.Person;
import io.nikoden.firstjourney.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }


    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public Person getPersonById(String id) {
        Optional<Person> person = personRepository.findById(id);
        return person.orElse(null); // you can also throw an exception here
    }

    public Person updatePerson(String id, PersonDto personDto) {
        Optional<Person> personOpt = personRepository.findById(id);
        if (personOpt.isPresent()) {
            Person person = personOpt.get();
            person.setName(personDto.getName());
            person.setAge(personDto.getAge());
            return personRepository.save(person);
        }
        return null; // you can also throw an exception here
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}
