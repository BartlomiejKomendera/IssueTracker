package com.bartlomiejkomendera.IssueTracker.data.h2;

import com.bartlomiejkomendera.IssueTracker.model.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueDao extends CrudRepository<Issue,Long> { }
