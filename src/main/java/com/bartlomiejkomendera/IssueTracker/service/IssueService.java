package com.bartlomiejkomendera.IssueTracker.service;

import com.bartlomiejkomendera.IssueTracker.data.h2.IssueDao;
import com.bartlomiejkomendera.IssueTracker.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IssueService implements IssueServiceInterface{

    @Autowired
    private IssueDao issueDao;

    @Override
    public void create(Issue issue) {
        issueDao.save(issue);
    }

    @Override
    public Optional<Issue> getIssueById(Long id) {
        return issueDao.findById(id);
    }

    @Override
    public List<Issue> getAllIssues() {
        return (List<Issue>) issueDao.findAll();
    }

    @Override
    public void update(Issue issue) {
        issueDao.save(issue);
    }

    @Override
    public void delete(Long id) {
        issueDao.deleteById(id);
    }
}
