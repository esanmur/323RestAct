package com.gcu.restactivity.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "activity")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean urgent;

    @Column(nullable = false)
    private boolean important;


    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    //Getters
    public boolean getImportant() {
        return important;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    

}
