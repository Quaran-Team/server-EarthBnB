package com.Earthbb.Reviews;

import lombok.*;
import lombok.experimental.Accessors;

import com.Earthbb.MPTS.Mpts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

@Entity
@Data // Lombok annotation; tells it to create getters and setters
@Accessors (fluent = true)
@AllArgsConstructor // lombok annotation to create constructor with all args
@NoArgsConstructor // lombok annotation to create no-args constructor
@DynamicInsert
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

    @Column(name = "locationreviewed", columnDefinition = "json")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "locations_id", nullable = false, referencedColumnName = "id")
    private Mpts locationrev;
}