package by.itacademy.repository;

import by.itacademy.model.EmailDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class EmailDetailRepositoryTest extends CommonTest {

    @Autowired
    private EmailDetailRepository emailDetailRepository;

    @Test
    public void saveTest() {
        EmailDetail emailDetail = new EmailDetail();
        emailDetail.setEmail("vintyk1989@hhh.com");
        EmailDetail save = emailDetailRepository.save(emailDetail);
        Optional<EmailDetail> emailDetailOptional = emailDetailRepository.findById(save.getId());
        Assert.assertNotNull(emailDetailOptional);
        EmailDetail emailDetailFromDB = null;
        if (emailDetailOptional.isPresent()) {
            emailDetailFromDB = emailDetailOptional.get();
        }
        Assert.assertEquals(emailDetail.getEmail(), emailDetailFromDB.getEmail());
        emailDetailRepository.delete(emailDetail);
    }

    @Test
    public void chekFindById() {
        Iterable<EmailDetail> all = emailDetailRepository.findAll();
        System.out.println(all);
    }
}
