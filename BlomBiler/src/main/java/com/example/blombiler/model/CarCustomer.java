package com.example.blombiler.model;

public class CarCustomer {
    private int car_customer_id;
    private int customer_id;
    private int car_id;

    public CarCustomer() {

    }

    public int getCar_customer_id() {
        return car_customer_id;
    }

    public void setCar_customer_id(int car_customer_id) {
        this.car_customer_id = car_customer_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
}
