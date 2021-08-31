package com.bartlomiejkomendera.IssueTracker.web;

import com.bartlomiejkomendera.IssueTracker.model.Issue;
import com.bartlomiejkomendera.IssueTracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class MainController {

    @Autowired
    private IssueService issueService;

    @GetMapping("/all")
    public List<Issue> displayAll(){
        return issueService.getAllIssues();
    }

    @GetMapping("/new")
    public void createNew(@RequestBody Issue issue){
        issueService.create(issue);
    }
}
