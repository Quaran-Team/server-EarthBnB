package com.Earthbb.TTD;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name = "todo")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ttd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String img;
    private Double rating;
    private Integer reviews;
    private String title;
    private String category;
    private Double price;
    private String location;
    private Boolean favorite;
    private String info;

    public Ttd(Long id, String img, Double rating, Integer reviews, String title, String category, Double price, String location, Boolean favorite, String info) {
        this.id = id;
        this.img = img;
        this.rating = rating;
        this.reviews = reviews;
        this.title = title;
        this.category = category;
        this.price = price;
        this.location = location;
        this.favorite = favorite;
        this.info = info;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Ttd() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
