package com.bartlomiejkomendera.IssueTracker.service;

import com.bartlomiejkomendera.IssueTracker.model.Issue;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IssueServiceInterface {

    void create(Issue issue);

    Optional<Issue> getIssueById(Long id);

    List<Issue> getAllIssues();

    List<Issue> getPage(int page, int size);

    void update(Issue issue);

    void delete(Long id);
}
