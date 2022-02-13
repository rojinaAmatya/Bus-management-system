package com.drs.dao.impl;

import com.drs.dao.BussDAO;
import com.drs.pojo.Buss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BussDAOImpl implements BussDAO {

    Scanner sc = new Scanner(System.in);
    List<Buss> addBusses = new ArrayList<>();
    @Override
    public void addBuss() {
        int k =1;
        while(k ==1){
            System.out.println("Please enter the Buss id: ");
            int buss_id = sc.nextInt();
            System.out.println("Please enter the Buss name: ");
            String buss_name = sc.next();
            System.out.println("Please enter the Buss type: 1. A/C? 2. No A/C");
            String buss_type = sc.next();
            System.out.println("Please enter *From* destination:");
            String destination_from = sc.next();
            System.out.println("Please enter *To* destination:");
            String destination_to = sc.next();
            System.out.println("Please enter the price of bus ticket: ");
            double buss_price = sc.nextDouble();

            Buss buss = new Buss(buss_id,buss_name,buss_type, destination_from,destination_to,buss_price);
            addBusses.add(buss);
            System.out.println("Buss information is added successfully");

            System.out.println("Would like to add more buss? Press 1) Yes 2) No");
            k = sc.nextInt();
        }//end of while

    }

    @Override
    public List<Buss> viewAllBuss() {
        return addBusses;
    }

    @Override
    public Buss viewBuss(int buss_id) {
        for(Buss buss: addBusses){
            if(buss.getBuss_id()== buss_id){
                return buss;
            }
        }
        return null;
    }

    @Override
    public void updateBuss(int buss_id) {
        for(Buss buss: addBusses){
            if(buss.getBuss_id()== buss_id ){
                System.out.println("Do you want to update 1. From Destination or 2. To Destination 3. Price of ticket");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Please enter From destination to update: ");
                        buss.setDestination_from(sc.next());
                        System.out.println("From destination is changed successfully");
                        break;

                    case 2:
                        System.out.println("Please enter To destination to update: ");
                        buss.setDestination_to(sc.next());
                        System.out.println("To destination is changed successfully");
                        break;

                    case 3:
                        System.out.println("Please enter the price to update: ");
                        buss.setBuss_price(sc.nextDouble());
                        System.out.println("The price is updated successfully");

                    default:
                        System.out.println("Please choose between option 1, 2,and 3");
                }//end of switch
            }//end of if
            else{
                System.out.println("Buss record is not found!");
            }// end of else
        }// end of for

    }

    @Override
    public void deleteBuss(int buss_id) {
        int j = 0;
        for(Buss buss: addBusses){
            if(buss.getBuss_id() == buss_id){
                ++j;
                addBusses.remove(buss);
                System.out.println("Buss information is deleted successfully");
                break;
            }//end of if
        }//end of for

        if(j ==0 ){
            System.out.println("Buss information is not found. Please Try  Again!!");
        }
    }
}
