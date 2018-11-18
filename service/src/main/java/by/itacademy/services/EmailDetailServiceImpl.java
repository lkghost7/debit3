package by.itacademy.services;

import by.itacademy.model.EmailDetail;
import by.itacademy.repository.EmailDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmailDetailServiceImpl implements EmailDetailService {

    private final EmailDetailRepository emailDetailRepository;

    @Autowired
    public EmailDetailServiceImpl(EmailDetailRepository emailDetailRepository) {
        this.emailDetailRepository = emailDetailRepository;
    }

    @Override
    public Long save(EmailDetail emailDetail) {
        EmailDetail save = emailDetailRepository.save(emailDetail);
        return save.getId();
    }
}
