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
import org.hibernate.annotations.GenericGenerator;

@Table(name = "sleepingarrs")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SleepingArrs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator( name = "native", strategy = "native")
    private Long id;

    private String roomtype;
    private Integer bedcount;
    private String bedtype;
    private Long location;
    private String category;

    public SleepingArrs(Long id, String roomtype, Integer bedcount, String bedtype, Long location, String category) {
        this.id = id;
        this.roomtype = roomtype;
        this.bedcount = bedcount;
        this.bedtype = bedtype;
        this.location = location;
        this.category = category;
    }

    public SleepingArrs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getBedcount() {
        return bedcount;
    }

    public void setBedcount(Integer bedcount) {
        this.bedcount = bedcount;
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
