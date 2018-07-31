package com.tw.twMall.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "twMall")
public class Production {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String category;
    private String brand;
    private String description;
    private LocalDateTime productionDate;
    private String productionPlace;

    public Production(String name, int price, String category, String brand, String description, LocalDateTime productionDate, String productionPlace) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.brand = brand;
        this.description = description;
        this.productionDate = productionDate;
        this.productionPlace = productionPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDateTime productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductionPlace() {
        return productionPlace;
    }

    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace;
    }
}
