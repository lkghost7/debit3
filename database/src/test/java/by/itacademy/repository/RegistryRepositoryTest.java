package by.itacademy.repository;

import by.itacademy.model.RegistryOfContract;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RegistryRepositoryTest extends CommonTest{
    @Autowired
   private RegistryRepository registryRepository;

    @Test
    public void findByNumberOfContractAndAmountContract() {
        RegistryOfContract rezult = registryRepository.findByNumberOfContractAndAmountContract("катя", "ррр");
        System.out.println(rezult);
    }


    @Test
    public void findByNumberOfContract()  {
        RegistryOfContract registryOfContract = registryRepository.findByNumberOfContract("батя");
        System.out.println(registryOfContract);
    }

    @Test
    public void chekFindAll () {
        Iterable<RegistryOfContract> all = registryRepository.findAll();
        for (RegistryOfContract registryOfContract : all) {
            System.out.println(registryOfContract);
        }
    }

}