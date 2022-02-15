package com.drs.dao.impl;

import com.drs.dao.BussDAO;
import com.drs.dao.CustomerDAO;
import com.drs.details.BussDetails;
import com.drs.pojo.Buss;
import com.drs.pojo.Customer;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com.drs.dao.impl.BussDAOImpl.addBusses;


public class CustomerDAOImpl implements CustomerDAO{
    Scanner sc = new Scanner(System.in);
    static List<Customer> addCustomer = new ArrayList<>();

    @Override
    public void customerInformation() {
        int k =1;
        while(k==1){
            System.out.println("Please enter your name: ");
            String cuss_name = sc.next();
            System.out.println("Please enter your email: ");
            String cuss_email = sc.next();
            System.out.println("Please enter your address: ");
            String cuss_address = sc.next();
            SecureRandom random = new SecureRandom();
            int booking_number = random.nextInt(1000);
            Customer customer = new Customer(cuss_name,cuss_email,cuss_address,booking_number);
            addCustomer.add(customer);
            System.out.println("Customer is registered successfully");

            System.out.println("Would you like to add more customer? 1.Yes 2.No");
            k= sc.nextInt();
        }//end of while
    }

    @Override
    public void bookTicket(int buss_id) {
        int j = 0;
        for(Buss buss: addBusses){
           if(buss.getBuss_id() == buss_id){
               ++j;
               System.out.println("Ticket is booked");
               System.out.println(" ");
               System.out.println("       Booking Confirmation");
               System.out.println("***************************************");
               for(Customer cuss: addCustomer) {
                   System.out.println(" ");
                   System.out.println("Confirmation Number: " +cuss.getBooking_number());
                   System.out.println("Customer Name: " + cuss.getCus_name());
                   System.out.println("Customer Address: " + cuss.getCus_address());
                   System.out.println("Customer Email: " + cuss.getCus_email());
               }
               System.out.println("Buss Name:" + buss.getBuss_name());
               System.out.println("Buss Type:"+ buss.getBuss_type());
               System.out.println("Destination from: " + buss.getDestination_from());
               System.out.println("Destination to:" + buss.getDestination_to());
               System.out.println(" ");
           }
       }
       if(j == 0){
           System.out.println("Booking is not completed");
       }
    }

    @Override
    public void cancelTicket(int booking_num) {
        int j = 0;
        for(Customer cuss: addCustomer){
            if(cuss.getBooking_number() == booking_num){
                System.out.println("Booking num: " + cuss.getBooking_number());
                ++j;
                addCustomer.remove(cuss);
                System.out.println("Booking is cancelled successfully");
                break;
            }//end of if
        }//end of for

        if(j ==0){
            System.out.println("Confirmation booking number is not found");
        }
    }
}
