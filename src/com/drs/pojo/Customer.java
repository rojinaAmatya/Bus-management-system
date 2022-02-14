package com.drs.pojo;

import java.util.UUID;

public class Customer {
    private String cus_name;
    private String cus_email;
    private String cus_address;

    public Customer() {
        super();
    }

    public Customer(String cus_name, String cus_email, String cus_address) {
        this.cus_name = cus_name;
        this.cus_email = cus_email;
        this.cus_address = cus_address;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_email() {
        return cus_email;
    }

    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }


}
