package io.nikoden.firstjourney.repository;

import io.nikoden.firstjourney.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
