package by.itacademy.repository;

import by.itacademy.model.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.Assert.*;

public class PersonRepositoryTest extends CommonTest {

    @Autowired
    private PersonRepository personRepository;


    @Test
public void chekFindById() {
    Iterable<Person> all = personRepository.findAll();
    System.out.println(all);
}
}