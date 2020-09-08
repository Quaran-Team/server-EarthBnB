package com.Earthbb.Reviews;

import lombok.*;
import lombok.experimental.Accessors;

import com.Earthbb.MPTS.Mpts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

//import java.sql.Date; //might need this later when converting over to date values
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.TypeDef;

@Entity
@Data // Lombok annotation; tells it to create getters and setters
@Accessors (fluent = true)
@AllArgsConstructor // lombok annotation to create constructor with all args
@NoArgsConstructor // lombok annotation to create no-args constructor
@DynamicInsert
@Table(name = "reviews")
@TypeDef(name = "json", typeClass = JsonStringType.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewid")
    private long reviewId;

    @Column(name = "username")
    private String userName;

    @Column(name = "userprofile")
    private String userprofile;

    @Column(name = "reviewtext")
    private String reviewText;

    @Column(name = "reviewcategories", columnDefinition = "json")
    private List<String> reviewCategories;

    @Column(name = "postedDate")
    private String postedDate;

    @Column(name = "locationreviewed", columnDefinition = "json")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "locations_id", nullable = false)
    private Mpts location; //should be a foreign key to location id
}