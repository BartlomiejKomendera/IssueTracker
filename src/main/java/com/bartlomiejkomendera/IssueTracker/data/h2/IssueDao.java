package com.bartlomiejkomendera.IssueTracker.data.h2;

import com.bartlomiejkomendera.IssueTracker.model.Issue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueDao extends CrudRepository<Issue,Long> {

    //@Query("SELECT i FROM issue i OFFSET :offset ROWS FETCH NEXT :fetch ROWS ONLY")
    /*@Query("SELECT i FROM issue i ORDER BY id DESC LIMIT :fetch OFFSET :offset")
    List<Issue> getPageList(@Param("offset") int offset, @Param("fetch") int fetch);*/
}
