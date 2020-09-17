package com.Earthbb.Reviews;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    
    //can make method with query keywords to get results needed
    List<Reviews> findByLocationReviewed(int locId); //@Param("locId")
}
