package com.Earthbb.Reviews;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    
    //can make method with query keywords to get results needed
    List<Reviews> findByLocationReviewed(int locId); //@Param("locId")
}
