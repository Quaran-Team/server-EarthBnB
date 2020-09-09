package com.Earthbb.PhotosBWL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name="photos")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class PhotoData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sauce;
    private String pic1url;
    private String pic1alt;
    private String pic2url;
    private String pic2alt;
    private String pic3url;
    private String pic3alt;
    private String pic4url;
    private String pic4alt;
    private String pic5url;
    private String pic5alt;
    private String pic6url;
    private String pic6alt;
    private String pic7url;
    private String pic7alt;
    private String pic8url;
    private String pic8alt;

    public void photos(Long id, String source, String pic1url, String pic1alt, String pic2url, String pic2alt, String pic3url, String pic3alt, String pic4url, String pic4alt, String pic5url, String pic5alt, String pic6url, String pic6alt, String pic7url, String pic7alt, String pic8url, String pic8alt){
        this.id = id;
        this.sauce = sauce;
        this.pic1url = pic1url;
        this.pic1alt = pic1alt;
        this.pic2url = pic2url;
        this.pic2alt = pic2alt;
        this.pic3url = pic3url;
        this.pic3alt = pic3alt;
        this.pic4url = pic4url;
        this.pic4alt = pic4alt;
        this.pic5url = pic5url;
        this.pic5alt = pic5alt;
        this.pic6url = pic6url;
        this.pic6alt = pic6alt;
        this.pic7url = pic7url;
        this.pic7alt = pic7alt;
        this.pic8url = pic8url;
        this.pic8alt = pic8alt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getPic1url() {
        return pic1url;
    }

    public void setPic1url(String pic1url) {
        this.pic1url = pic1url;
    }

    public String getPic1alt() {
        return pic1alt;
    }

    public void setPic1alt(String pic1alt) {
        this.pic1alt = pic1alt;
    }

    public String getPic2url() {
        return pic2url;
    }

    public void setPic2url(String pic2url) {
        this.pic2url = pic2url;
    }

    public String getPic2alt() {
        return pic2alt;
    }

    public void setPic2alt(String pic2alt) {
        this.pic2alt = pic2alt;
    }

    public String getPic3url() {
        return pic3url;
    }

    public void setPic3url(String pic3url) {
        this.pic3url = pic3url;
    }

    public String getPic3alt() {
        return pic3alt;
    }

    public void setPic3alt(String pic3alt) {
        this.pic3alt = pic3alt;
    }

    public String getPic4url() {
        return pic4url;
    }

    public void setPic4url(String pic4url) {
        this.pic4url = pic4url;
    }

    public String getPic4alt() {
        return pic4alt;
    }

    public void setPic4alt(String pic4alt) {
        this.pic4alt = pic4alt;
    }

    public String getPic5url() {
        return pic5url;
    }

    public void setPic5url(String pic5url) {
        this.pic5url = pic5url;
    }

    public String getPic5alt() {
        return pic5alt;
    }

    public void setPic5alt(String pic5alt) {
        this.pic5alt = pic5alt;
    }

    public String getPic6url() {
        return pic6url;
    }

    public void setPic6url(String pic6url) {
        this.pic6url = pic6url;
    }

    public String getPic6alt() {
        return pic6alt;
    }

    public void setPic6alt(String pic6alt) {
        this.pic6alt = pic6alt;
    }

    public String getPic7url() {
        return pic7url;
    }

    public void setPic7url(String pic7url) {
        this.pic7url = pic7url;
    }

    public String getPic7alt() {
        return pic7alt;
    }

    public void setPic7alt(String pic7alt) {
        this.pic7alt = pic7alt;
    }

    public String getPic8url() {
        return pic8url;
    }

    public void setPic8url(String pic8url) {
        this.pic8url = pic8url;
    }

    public String getPic8alt() {
        return pic8alt;
    }

    public void setPic8alt(String pic8alt) {
        this.pic8alt = pic8alt;
    }
}
