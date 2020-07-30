package com.bamdow.example;

/**
 * @Auther Sam Li
 * @Date 2020-07-31
 */
public class Car {

    private String id;

    public Car(String id) {
        this.id = id;
    }

    public Car() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void run() {
        System.out.println("car run");
    }
}
