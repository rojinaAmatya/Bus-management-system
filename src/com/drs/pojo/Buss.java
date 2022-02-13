package com.drs.pojo;

public class Buss {
    private int buss_id;
    private String buss_name;
    private String buss_type;
    private String destination_from;
    private String destination_to;
    private double buss_price;

    public Buss() {
        super();
    }

    public Buss(int buss_id, String buss_name, String buss_type, String destination_from, String destination_to, double buss_price) {
        this.buss_id = buss_id;
        this.buss_name = buss_name;
        this.buss_type = buss_type;
        this.destination_from = destination_from;
        this.destination_to = destination_to;
        this.buss_price= buss_price;
    }

    public int getBuss_id() {
        return buss_id;
    }

    public void setBuss_id(int buss_id) {
        this.buss_id = buss_id;
    }

    public String getBuss_name() {
        return buss_name;
    }

    public void setBuss_name(String buss_name) {
        this.buss_name = buss_name;
    }

    public String getBuss_type() {
        return buss_type;
    }

    public void setBuss_type(String buss_type) {
        this.buss_type = buss_type;
    }

    public String getDestination_from() {
        return destination_from;
    }

    public void setDestination_from(String destination_from) {
        this.destination_from = destination_from;
    }

    public String getDestination_to() {
        return destination_to;
    }

    public void setDestination_to(String destination_to) {
        this.destination_to = destination_to;
    }

    public double getBuss_price() {
        return buss_price;
    }

    public void setBuss_price(double buss_price) {
        this.buss_price = buss_price;
    }
}
