package com.drs.details;

import com.drs.dao.impl.BussDAOImpl;
import com.drs.pojo.Buss;

import java.util.List;
import java.util.Scanner;

public class BussDetails {
    Scanner sc = new Scanner(System.in);
    BussDAOImpl daoImpl = new BussDAOImpl();

    public void bussDetails(){
        while(true){
            System.out.println("--------------------------------------------------------------");
            System.out.println("       1. Add Buss");
            System.out.println("       2. View All Buss");
            System.out.println("       3. View Buss");
            System.out.println("       4. Update Buss");
            System.out.println("       5. Delete Buss");
            System.out.println("       6. Back");
            System.out.println("--------------------------------------------------------------");
            System.out.println(" " );

            System.out.println("Please enter the choice from above Menu: ");
            int choice= sc.nextInt();

            switch (choice){
                case 1:
                    daoImpl.addBuss();
                    bussDetails();
                    break;

                case 2:
                    List <Buss> viewBusses = daoImpl.viewAllBuss();
                    System.out.println("==========================================================================");
                    System.out.println("Buss_ID\t Buss_Name\t Buss_Type\t From\t To\t");
                    System.out.println("==========================================================================");
                    for(Buss buss: viewBusses){
                        System.out.println(buss.getBuss_id()+ "\t" + buss.getBuss_name()+ "\t" + buss.getBuss_type()+ "\t" + buss.getDestination_from()+ "\t" + buss.getDestination_from() );
                    }
                    bussDetails();
                    break;

                case 3:
                    System.out.println("Please enter the buss ID to display");
                    Buss buss = daoImpl.viewBuss(sc.nextInt());
                    System.out.println("==========================================================================");
                    System.out.println("Buss_ID\t Buss_Name\t Buss_Type\t From\t To\t");
                    System.out.println("==========================================================================");
                    if(buss != null){
                        System.out.println(buss.getBuss_id()+ "\t" + buss.getBuss_name()+ "\t" + buss.getBuss_type()+ "\t" + buss.getDestination_from()+ "\t" + buss.getDestination_from() );
                    }//end of if
                    else{
                        System.out.println("**Buss Record is not found**");
                    }
                    bussDetails();
                    break;

                case 4:
                    System.out.println("Please enter the buss ID to update: ");
                    daoImpl.updateBuss(sc.nextInt());
                    bussDetails();
                    break;

                case 5:
                    System.out.println("Please enter the buss ID to delete: ");
                    daoImpl.deleteBuss(sc.nextInt());
                    bussDetails();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Please choose between 1 to 6");

            }//end of switch
        }//end of while
    }
}
