package by.itacademy.dao;

import by.itacademy.model.RegistryOfContract;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RegistryContractsDaoTest {

    @Test
    public void save() {
        RegistryOfContract registryOfContract = new RegistryOfContract();
        registryOfContract.setNameOfCounterparty("test1");
        registryOfContract.setNameOfCounterparty("test2");
        registryOfContract.setConclusionDate("data");

        RegistryContractsDao.getInstance().save(registryOfContract);
        RegistryContractsDao.getInstance().delete(registryOfContract);
    }

    @Test
    public void findAll() {
        List<RegistryOfContract> list = RegistryContractsDao.getInstance().findAll();
        Assert.assertNotNull(list);

    }
}