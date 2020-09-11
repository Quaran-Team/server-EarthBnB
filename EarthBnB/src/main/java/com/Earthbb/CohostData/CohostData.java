package com.Earthbb.CohostData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name="cohostdata")

@Entity 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CohostData {
    @Id
    private Long id;
    private String nameone;
    private String imageurlone;
    private String nametwo;
    private String imageurltwo;

    public CohostData(Long id, String nameone, String imageurlone, String nametwo, String imageurltwo) {
        this.id = id;
        this.nameone = nameone;
        this.imageurlone = imageurlone;
        this.nametwo = nametwo;
        this.imageurltwo = imageurltwo;
    }
    
    public CohostData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameone() {
        return nameone;
    }

    public void setNameone(String nameone) {
        this.nameone = nameone;
    }

    public String getImageurlone() {
        return imageurlone;
    }

    public void setImageurlone(String imageurlone) {
        this.imageurlone = imageurlone;
    }

    public String getNametwo() {
        return nametwo;
    }

    public void setNametwo(String nametwo) {
        this.nametwo = nametwo;
    }

    public String getImageurltwo() {
        return imageurltwo;
    }

    public void setImageurltwo(String imageurltwo) {
        this.imageurltwo = imageurltwo;
    }

}
