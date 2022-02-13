package com.drs.menu;

import com.drs.details.BussDetails;

import java.util.Scanner;

public class BussMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("****************** MAIN MENU ******************");
            System.out.println("                  1. Admin");
            System.out.println("                  2. Customer");
            System.out.println("                  3. Exit");
            System.out.println("************************************************");
            System.out.println(" ");

            System.out.println("Please enter the choice from the Menu");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    BussDetails bussDao = new BussDetails();
                    bussDao.bussDetails();
                    break;


                case 3:
                    System.out.println("Thank you for using the application! ");
                    System.exit(0);

                default:
                    System.out.println("Please choose between 1 to 3");
            } // end of switch
        }
    }
}
