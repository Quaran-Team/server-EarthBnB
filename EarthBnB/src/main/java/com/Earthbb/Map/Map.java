package com.Earthbb.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name="locations")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String city;
    private String state_territory;
    private String country;
    private Boolean international;
    private int zip;

    public Map(String street, String city, String state_territory, String country, Boolean international, int zip) {
        this.street = street;
        this.city = city;
        this.state_territory = state_territory;
        this.country = country;
        this.international = international;
        this.zip = zip;
    }

    public Map() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}