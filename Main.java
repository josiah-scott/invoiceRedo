package com.company;
import java.util.Scanner;
import java.util.ArrayList;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        ArrayList<String> products = new ArrayList<String>();
        
        ArrayList<Double> prices = new ArrayList<Double>();

        Product sweater = new Product();
        sweater.name = "Bison Sweater";
        sweater.price = 55.99;

        Product tee = new Product();
        tee.name = "Bison Tee";
        tee.price = 14.99;

        Product hoodie = new Product();
        hoodie.name = "Bison Hoodie";
        hoodie.price = 23.99;

        Product bumpersticker = new Product();
        bumpersticker.name = "Bison Bumpersticker";
        bumpersticker.price = 4.99;

        Scanner keyboard = new Scanner(System.in);

        String answer = "";
        ArrayList<String> purchases = new ArrayList<String>();

        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase, 2) change purchase, 3) show purchases, 4) finish transaction");
            answer = keyboard.nextLine();
            if (answer.equals("1")) {
                System.out.println("What do you wish to buy?");
                answer = keyboard.nextLine();
                purchases.add(answer);
            } else if (answer.equals("2")) {
                System.out.println("What do you wish to change?");
                String change = keyboard.nextLine();

                System.out.println("What do you want to replace it with?");
                String swapItem = keyboard.nextLine();
            } else if (answer.equals("3")) {
                for (int i = 0; i < purchases.size(); i++) {
                    System.out.println(purchases.get(i));
                }
            }
        }
        while (!answer.equals("4"));

        double totalCost = 0.0;
        int a = 0;
        for (int i = 0; i < purchases.size(); i++) {
            a = 0;
            do {
                if (purchases.get(i).equals(products.get(a))) {
                    totalCost = totalCost + prices.get(a);
                }
                a++;
            }
            while (a < products.size());
            System.out.println("Total Cost: " + totalCost);
        }

    }
}
