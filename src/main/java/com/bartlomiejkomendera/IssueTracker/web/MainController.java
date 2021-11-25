package com.bartlomiejkomendera.IssueTracker.web;

import com.bartlomiejkomendera.IssueTracker.model.Issue;
import com.bartlomiejkomendera.IssueTracker.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MainController {

    @Autowired
    private IssueService issueService;

    @GetMapping("/all")
    public List<Issue> displayAll(){
        return issueService.getAllIssues();
    }

    @GetMapping("/page")
    public List<Issue> displayPage(@RequestParam int page, @RequestParam int size){
        return issueService.getPage(page, size);
    }

    @PostMapping("/new")
    public void createNew(@RequestBody Issue issue){
        issueService.create(issue);
    }

    @GetMapping("/id")
    public Optional<Issue> getById(@RequestParam Long id){
        return issueService.getIssueById(id);
    }

    @PutMapping("/edit")
    public void update(@RequestBody Issue issue){
        issueService.update(issue);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        issueService.delete(id);
    }
}
