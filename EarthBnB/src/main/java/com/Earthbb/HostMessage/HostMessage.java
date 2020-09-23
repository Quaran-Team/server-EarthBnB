package com.Earthbb.HostMessage;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Table(name="hostmessage")

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HostMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator( name = "native", strategy = "native")
    private Long id;

    private String entirehouse;
    private String cleanliness;
    private String superhost;
    private String cancellation;
    private String mainbody;
    private String hostspace;
    private String othernotes;

    public HostMessage(Long id, String entirehouse, String cleanliness, String superhost, String cancellation, String mainbody, String hostspace, String othernotes) {
        this.id = id;
        this.entirehouse = entirehouse;
        this.cleanliness = cleanliness;
        this.superhost = superhost;
        this.cancellation = cancellation;
        this.mainbody = mainbody;
        this.hostspace = hostspace;
        this.othernotes = othernotes;
    }

    public HostMessage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntirehouse() {
        return entirehouse;
    }

    public void setEntirehouse(String entirehouse) {
        this.entirehouse = entirehouse;
    }

    public String getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(String cleanliness) {
        this.cleanliness = cleanliness;
    }

    public String getSuperhost() {
        return superhost;
    }

    public void setSuperhost(String superhost) {
        this.superhost = superhost;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    public String getMainbody() {
        return mainbody;
    }

    public void setMainbody(String mainbody) {
        this.mainbody = mainbody;
    }

    public String getHostspace() {
        return hostspace;
    }

    public void setHostspace(String hostspace) {
        this.hostspace = hostspace;
    }

    public String getOthernotes() {
        return othernotes;
    }

    public void setOthernotes(String othernotes) {
        this.othernotes = othernotes;
    }
}
