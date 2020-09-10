package com.Earthbb.MPTS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name="locations")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Mpts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double rating;
    private int numberofratings;
    private Boolean superhost;
    private double price;
    private String street;
    private String city;
    private String state_territory;
    private String country;
    private Boolean international;
    private int zip;
    private String title;
    private String host;
    private int guests;
    private int beds;
    private int bedrooms;
    private int bathrooms;

    public Mpts(Long id, double rating, int numberofratings, Boolean superhost, double price, String street, String city, String state_territory, String country, Boolean international, int zip, String title, String host, int guests, int beds, int bedrooms, int bathrooms) {
        this.id = id;
        this.rating = rating;
        this.numberofratings = numberofratings;
        this.superhost = superhost;
        this.price = price;
        this.street = street;
        this.city = city;
        this.state_territory = state_territory;
        this.country = country;
        this.international = international;
        this.zip = zip;
        this.title = title;
        this.host = host;
        this.guests = guests;
        this.beds = beds;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public Mpts() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberofratings() {
        return numberofratings;
    }

    public void setNumberofratings(int numberofratings) {
        this.numberofratings = numberofratings;
    }

    public Boolean getSuperhost() {
        return superhost;
    }

    public void setSuperhost(Boolean superhost) {
        this.superhost = superhost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_territory() {
        return state_territory;
    }

    public void setState_territory(String state_territory) {
        this.state_territory = state_territory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getInternational() {
        return international;
    }

    public void setInternational(Boolean international) {
        this.international = international;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

}
