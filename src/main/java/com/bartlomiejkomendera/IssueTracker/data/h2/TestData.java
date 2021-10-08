package com.bartlomiejkomendera.IssueTracker.data.h2;

import com.bartlomiejkomendera.IssueTracker.data.h2.IssueDao;
import com.bartlomiejkomendera.IssueTracker.model.Issue;
import com.bartlomiejkomendera.IssueTracker.web.authentication.User;
import com.bartlomiejkomendera.IssueTracker.web.authentication.UserDao;
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
        issueDao.save(new Issue("Example Issue 1", "Example short description","Example Department","Open","Low", "admin"));
        issueDao.save(new Issue("Example Issue Number 2", "Example medium description in length. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.","Example Department Number 2",
                "Closed","High","admin"));
        issueDao.save(new Issue("Example Issue Number 3 with longer title", "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. " +
                "The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. " +
                "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. " +
                "Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Example Department Number 3",
                "Closed","Medium","bkomendera"));
        issueDao.save(new Issue("Example Issue 4", "Example short description","Example Department","Open","Low", "admin"));
        issueDao.save(new Issue("Example Issue Number 5", "Example medium description in length. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.","Example Department Number 2",
                "Closed","High","admin"));
        issueDao.save(new Issue("Example Issue Number 6 with longer title", "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. " +
                "The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. " +
                "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. " +
                "Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Example Department Number 3",
                "Closed","Medium","bkomendera"));
        issueDao.save(new Issue("Example Issue 7", "Example short description","Example Department","Open","Low", "admin"));
        issueDao.save(new Issue("Example Issue Number 8", "Example medium description in length. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.","Example Department Number 2",
                "Closed","High","admin"));
        issueDao.save(new Issue("Example Issue Number 9 with longer title", "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. " +
                "The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. " +
                "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. " +
                "Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Example Department Number 3",
                "Closed","Medium","bkomendera"));
        issueDao.save(new Issue("Example Issue 10", "Example short description","Example Department","Open","Low", "admin"));
        issueDao.save(new Issue("Example Issue Number 11", "Example medium description in length. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.","Example Department Number 2",
                "Closed","High","admin"));
        issueDao.save(new Issue("Example Issue Number 12 with longer title", "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. " +
                "The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. " +
                "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. " +
                "Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Example Department Number 3",
                "Closed","Medium","bkomendera"));
    }
}