package com.drs.details;

import com.drs.dao.impl.BussDAOImpl;
import com.drs.dao.impl.CustomerDAOImpl;
import com.drs.menu.BussMenu;
import com.drs.pojo.Buss;


import java.util.List;
import java.util.Scanner;

public class CustomerDetails {
    Scanner sc = new Scanner(System.in);
    CustomerDAOImpl cussDAOImpl = new CustomerDAOImpl();
    BussDAOImpl daoImpl= BussDetails.daoImpl;


    public void customerDetails(){
        while(true){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("              1. View All Bus");
            System.out.println("              2. View Bus");
            System.out.println("              3. Book Tickets");
            System.out.println("              4. Cancel Tickets");
            System.out.println("              5. Back");
            System.out.println(" ");

            System.out.println("Please enter the choice from above menu: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    List<Buss> viewBusses = daoImpl.viewAllBuss();
                    System.out.println("==========================================================================");
                    System.out.println("Buss_ID\t Buss_Name\t Buss_Type\t From\t To\t Price\t");
                    System.out.println("==========================================================================");
                    for(Buss buss: viewBusses){
                        System.out.println(buss.getBuss_id()+ "\t" + buss.getBuss_name()+ "\t" + buss.getBuss_type()+
                                "\t" + buss.getDestination_from()+ "\t" + buss.getDestination_from() + "\t" + "$"+
                                buss.getBuss_price());
                    }
                    customerDetails();
                    break;


                case 2:
                    System.out.println("Please enter the buss ID to display");
                    Buss buss = daoImpl.viewBuss(sc.nextInt());
                    System.out.println("==========================================================================");
                    System.out.println("Buss_ID\t Buss_Name\t Buss_Type\t From\t To\t Price\t");
                    System.out.println("==========================================================================");
                    if(buss != null){
                        System.out.println(buss.getBuss_id()+ "\t" + buss.getBuss_name()+ "\t" + buss.getBuss_type()+
                                "\t" + buss.getDestination_from()+ "\t" + buss.getDestination_from()+ "\t" + "$"+
                                buss.getBuss_price() );
                    }//end of if
                    else{
                        System.out.println("**Buss Record is not found**");
                    }
                    customerDetails();
                    break;


                case 3:
                    cussDAOImpl.customerInformation();
                    System.out.println("Please enter the bus ID to book the ticket: ");
                    cussDAOImpl.bookTicket(sc.nextInt());
                    customerDetails();
                    break;

                case 4:
                    System.out.println("Please enter the Booking confirmation number: ");
                    cussDAOImpl.cancelTicket(sc.nextInt());
                    customerDetails();
                    break;

                case 5:
                    BussMenu.main(null);
                    break;

                default:
                    System.out.println("Please choose between 1 TO 5");


            }//end of switch
        }//end of while


    }
}
