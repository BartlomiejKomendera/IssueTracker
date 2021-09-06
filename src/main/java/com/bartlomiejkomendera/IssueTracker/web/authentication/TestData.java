package com.bartlomiejkomendera.IssueTracker.web.authentication;

import com.bartlomiejkomendera.IssueTracker.data.h2.IssueDao;
import com.bartlomiejkomendera.IssueTracker.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestData implements ApplicationRunner {

    private UserDao userRepository;
    private IssueDao issueDao;

    @Autowired
    public void DataLoader(UserDao userRepository, IssueDao issueDao) {

        this.userRepository = userRepository;
        this.issueDao = issueDao;
    }

    public void run(ApplicationArguments args) {

        userRepository.save(new User("admin", "123"));
        issueDao.save(new Issue("Example Issue","Example Department","Open","Low"));
        issueDao.save(new Issue("Example Issue Number 2","Example Department Number 2",
                "Closed","High"));
    }
}