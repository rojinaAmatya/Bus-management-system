package com.drs.pojo;

public class Bus {
    private int bus_id;
    private String bus_name;
    private String bus_type;
    private String destination_from;
    private String destination_to;

    public Bus() {
        super();
    }

    public Bus(int bus_id, String bus_name, String bus_type, String destination_from, String destination_to) {
        this.bus_id = bus_id;
        this.bus_name = bus_name;
        this.bus_type = bus_type;
        this.destination_from = destination_from;
        this.destination_to = destination_to;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getBus_type() {
        return bus_type;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
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
}
