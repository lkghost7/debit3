package by.itacademy.repository;

import by.itacademy.model.Company;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.Assert.*;

public class CompanyRepositoryTest extends CommonTest {
    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void findByName() {
        Company company = companyRepository.findByName("Новичёк3");
        System.out.println(company);
        System.out.println( company.getId());

    }

    @Test
    public void chekFindAll() {
        Iterable<Company> all = companyRepository.findAll();
        for (Company company : all) {
            System.out.println(company);
        }
    }

    @Test
    public void chekFindById() {
        Optional<Company> byId = companyRepository.findById(35L);
        System.out.println(byId);
    }


}