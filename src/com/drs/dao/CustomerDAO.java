package com.drs.dao;
import com.drs.pojo.Customer;


public interface CustomerDAO {
    public void customerInformation();
    public void  bookTicket(int buss_id);
    public void cancelTicket(int booking_num);
}
