package com.Earthbb.HostData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name="hostdata")

@Entity 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HostData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int joindate;
    private boolean idverifided;
    private String biography;
    private String cohosts;
    private String duringstay;
    private String communication;
    private int responserate;
    private int responsetime;



    private String hostimageurl;

    public HostData(Long id, int joindate, boolean idverifided, String biography, String cohosts, String duringstay, String communication, int responserate, int responsetime, String hostimageurl) {
        this.id = id;
        this.joindate = joindate;
        this.idverifided = idverifided;
        this.biography = biography;
        this.cohosts = cohosts;
        this.duringstay = duringstay;
        this.communication = communication;
        this.responserate = responserate;
        this.responsetime = responsetime;
        this.hostimageurl = hostimageurl;
    }

    public HostData() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getJoindate() {
        return joindate;
    }

    public void setJoindate(int joindate) {
        this.joindate = joindate;
    }

    public boolean isIdverifieded() {
        return idverifided;
    }

    public void setIdverifieded(boolean idverifided) {
        this.idverifided = idverifided;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getCohosts() {
        return cohosts;
    }

    public void setCohosts(String cohosts) {
        this.cohosts = cohosts;
    }

    public String getDuringstay() {
        return duringstay;
    }

    public void setDuringstay(String duringstay) {
        this.duringstay = duringstay;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public int getResponserate() {
        return responserate;
    }

    public void setResponserate(int responserate) {
        this.responserate = responserate;
    }

    public int getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(int responsetime) {
        this.responsetime = responsetime;
    }

    public String getHostimageurl() {
        return hostimageurl;
    }

    public void setHostimageurl(String hostimageurl) {
        this.hostimageurl = hostimageurl;
    }
}
