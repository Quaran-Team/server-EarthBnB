package com.Earthbb.Reviews;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    
    @Query("SELECT * from reviews r WHERE r.locationreviewed = :locId")
    public List<Reviews> findAllByLocationID(@Param("locID") int locId);
}
