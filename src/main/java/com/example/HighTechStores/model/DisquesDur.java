package com.example.HighTechStores.model;

import javax.persistence.*;

@Entity
public class DisquesDur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private int id;
    private String article;
    private String caracteristique;
    private String image;

    public DisquesDur() {
    }

    public DisquesDur(String article, String caracteristique, String image) {
        this.article = article;
        this.caracteristique = caracteristique;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getCaracteristique() {
        return caracteristique;
    }

    public void setCaracteristique(String caracteristique) {
        this.caracteristique = caracteristique;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
