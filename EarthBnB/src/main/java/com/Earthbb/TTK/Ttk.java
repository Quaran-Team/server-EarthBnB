package com.Earthbb.TTK;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name="ttk")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ttk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String checkin;
    private String checkout;
    private String rules;

    public Ttk(Long id, String checkin, String checkout, String rules){
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.rules = rules;
    }

    public Ttk() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
}
