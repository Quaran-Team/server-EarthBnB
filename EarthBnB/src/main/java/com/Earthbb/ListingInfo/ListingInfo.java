package com.Earthbb.ListingInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Lombok annotation; tells it to create getters and setters
@AllArgsConstructor // lombok annotation to create constructor with all args
@NoArgsConstructor // lombok annotation to create no-args constructor
@Table(name = "locations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ListingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long listingID;

    @Column(name = "rating")
    private Long rating;

    @Column(name = "superhost")
    private Boolean superHost;

    @Column(name = "city")
    private String city;

    @Column(name = "state_territory")
    private String stateTerritory;

    @Column(name = "country")
    private String country;

    @Column(name = "title")
    private String title;

    @Column(name = "host")
    private String host;

    @Column(name = "guests")
    private String guests;

    @Column(name = "beds")
    private String beds;

    @Column(name = "bedrooms")
    private String bedRooms;

    @Column(name = "bathrooms")
    private String bathRooms;
}