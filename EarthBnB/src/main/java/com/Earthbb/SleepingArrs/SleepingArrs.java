package com.Earthbb.SleepingArrs;

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
@Table(name = "sleepingarrs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class SleepingArrs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long sleepingArrsId;

    @Column(name = "roomtype")
    private String roomType;

    @Column(name = "bedcount")
    private Integer bedCount;

    @Column(name = "bedtype")
    private String bedType;
}
