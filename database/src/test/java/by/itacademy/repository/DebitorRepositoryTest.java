package by.itacademy.repository;

import by.itacademy.model.Company;
import by.itacademy.model.Debitor;
import by.itacademy.model.EmailDetail;
import by.itacademy.model.RegistryOfContract;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class DebitorRepositoryTest extends CommonTest {

    @Autowired
    private DebitorRepository debitorRepository;

    @Test
    public void saveTestDebit (){
        Debitor debitor = new Debitor();
        debitor.setSubdivisions("tapok");
        debitorRepository.save(debitor);
    }


    @Test
    public void chekFindAll() {
        Iterable<Debitor> all = debitorRepository.findAll();
        for (Debitor debitor : all) {
            System.out.println(debitor);
        }
    }
}