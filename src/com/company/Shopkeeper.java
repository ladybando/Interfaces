package com.company;
import java.util.Scanner;
public class Shopkeeper extends Person implements Seller {
    Shopkeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a Shopkeeper!";
    }

    @Override
    public void sellGoods() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhat would you like? Select a number:"+
                " \n1 Chocolate" +
                " \n2 Wine" +
                " \n3 Cheese");
        int menuOption = sc.nextInt();
        //move to next line to take additional input
        sc.nextLine();
        System.out.println("How many would you like?");
        int quantity = sc.nextInt();

        double total = calcTotal(menuOption, quantity);
        System.out.println("Your total is " + total);
    }

    private double calcTotal(int menuOptionNumber, int quantity){
        double chocolate = 5.00;
        double wine = 20.00;
        double cheese = 8.00;
        double total = 0.0;

        switch (menuOptionNumber){
            case 1:
                total = chocolate * quantity;
                break;
            case 2:
                total = wine * quantity;
                break;
            case 3:
                total = cheese * quantity;
        }
        return total;
    }
}
