package com.Earthbb.Amenities;

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
@Table(name = "amenities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Amenities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long amenitiesId;

    @Column(name = "laptopfriendlyspace")
    private Boolean laptopFriendly;

    @Column(name = "cabletv")
    private Boolean cableTv;

    @Column(name = "airconditioning")
    private Boolean airConditioning;

    @Column(name = "essentials")
    private Boolean essentials;

    @Column(name = "wifi")
    private Boolean wifi;

    @Column(name = "hotwater")
    private Boolean hotWater;

    @Column(name = "heating")
    private Boolean heating;

    @Column(name = "tv")
    private Boolean tv;

    @Column(name = "freeparking")
    private Boolean freeParking;

    @Column(name = "refrigerator")
    private Boolean refrigerator;

    @Column(name = "microwave")
    private Boolean microwave;

    @Column(name = "coffeemaker")
    private Boolean coffeeMaker;

    @Column(name = "privateentrance")
    private Boolean privateEntrance;

    @Column(name = "lockbox")
    private Boolean lockBox;

    @Column(name = "longtermstaysallowed")
    private Boolean longTermStaysAllowed;

    @Column(name = "hangers")
    private Boolean hangers;

    @Column(name = "shampoo")
    private Boolean shampoo;

    @Column(name = "hairdryer")
    private Boolean hairDryer;

    @Column(name = "lockonbedroomdoor")
    private Boolean lockOnBedroomDoor;

    @Column(name = "smokealarm")
    private Boolean smokeAlarm;

    @Column(name = "carbonmonoxidealarm")
    private Boolean carbonMonoxideAlarm;

    @Column(name = "hottub")
    private Boolean hotTub;

    @Column(name = "spa")
    private Boolean spa;

    @Column(name = "swimarea")
    private Boolean swimArea;
}
