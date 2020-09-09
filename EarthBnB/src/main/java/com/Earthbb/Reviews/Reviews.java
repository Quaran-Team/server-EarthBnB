package com.Earthbb.Reviews;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Data // Lombok annotation; tells it to create getters and setters
@Accessors (fluent = true)
@AllArgsConstructor // lombok annotation to create constructor with all args
@NoArgsConstructor // lombok annotation to create no-args constructor
@Table(name = "reviews")
// @TypeDef(name = "json", typeClass = JsonStringType.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long reviewId;

    @Column(name = "username")
    private String userName;

    @Column(name = "userprofile")
    private String userProfile;

    @Column(name = "reviewtext")
    private String reviewText;

    @Column(name = "category_cleanliness")
    private double cleanliness;

    @Column(name = "category_accuracy")
    private double accuracy;

    @Column(name = "category_communication")
    private double communication;

    @Column(name = "category_location")
    private double catLocation;

    @Column(name = "category_checkin")
    private double checkIn;

    @Column(name = "category_value")
    private double catValue;

    @Column(name = "posteddate")
    private String postedDate;

    @Column(name = "locationreviewed")
    private int locationId;
}