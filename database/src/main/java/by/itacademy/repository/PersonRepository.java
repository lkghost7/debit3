package by.itacademy.repository;

import by.itacademy.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

//    Person findByName(String name);
//
//    Person findByFamaly(String famaly);
}