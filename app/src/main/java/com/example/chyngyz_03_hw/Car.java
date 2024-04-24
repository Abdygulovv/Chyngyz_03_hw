package com.example.chyngyz_03_hw;

public class Car {
    private String image;
    private String name;
    private String model;

    public Car(String image, String name, String model) {
        this.image = image;
        this.name = name;
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}