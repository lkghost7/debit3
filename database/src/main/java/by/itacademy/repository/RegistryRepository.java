package by.itacademy.repository;

import by.itacademy.model.RegistryOfContract;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistryRepository extends CrudRepository<RegistryOfContract, Long> {

    RegistryOfContract findByNumberOfContract (String name);

    RegistryOfContract findByNumberOfContractAndAmountContract(String contract, String amout);


}
