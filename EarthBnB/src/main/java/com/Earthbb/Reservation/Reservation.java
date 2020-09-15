package com.Earthbb.Reservation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Table(name="reservations")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator( name = "native", strategy = "native")
    private Long id;
    private String resdate;
    private Long locationid;
    

    public Reservation(Long id, String resdate, Long locationid) {
        this.id = id;
        this.resdate = resdate;
        this.locationid = locationid;
    }

    public Reservation() {

    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public Long getLocationid() {
        return locationid;
    }

    public void setLocationid(Long locationid) {
        this.locationid = locationid;
    }
}