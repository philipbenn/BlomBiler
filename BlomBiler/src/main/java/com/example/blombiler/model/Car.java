package com.example.blombiler.model;

public class Car {
    private int car_id;
    private String brand_name;
    private String model_name;
    private String fuel_type;
    private String category;
    private int upfront_payment;
    private int monthly_payment;
    private String car_image;
    private String car_feature;
    private String car_description;

    public Car() {

    }

    public String getCar_feature() {
        return car_feature;
    }

    public void setCar_feature(String car_feature) {
        this.car_feature = car_feature;
    }

    public String getCar_description() {
        return car_description;
    }

    public void setCar_description(String car_description) {
        this.car_description = car_description;
    }

    public String getCar_image() {
        return car_image;
    }

    public void setCar_image(String car_image) {
        this.car_image = car_image;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUpfront_payment() {
        return upfront_payment;
    }

    public void setUpfront_payment(int upfront_payment) {
        this.upfront_payment = upfront_payment;
    }

    public int getMonthly_payment() {
        return monthly_payment;
    }

    public void setMonthly_payment(int monthly_payment) {
        this.monthly_payment = monthly_payment;
    }
}
