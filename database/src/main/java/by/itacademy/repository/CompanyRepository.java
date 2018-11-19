package by.itacademy.repository;

import by.itacademy.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    Company findByName (String name);
}
