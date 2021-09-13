/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double order = sc.nextDouble();
        sc.nextLine();
        System.out.print("What state do you live in? ");
        String state = sc.nextLine();
        double tax = 0, total = 0, realTax = 0;
        String realTotal1 = "The total is $" + order;
        if (state.equals("Wisconsin"))
        {
            tax = 0.05;
            System.out.print("What county do you live in? ");
            String county = sc.nextLine();
            if (county.equals("Eau Claire"))
            {
                tax += .004;
            }
            if (county.equals(("Dane")))
            {
                tax += .005;
            }
            realTax = order * tax;
            total = order * (1 + tax);
            float realTotal = (float)Math.round(total * 100) / 100;
            realTotal1 = String.format("The subtotal is $%.2f \nThe tax is $%.2f \nThe total is $%.2f", order, realTax, realTotal);
        }
        if (state.equals("Illinois"))
        {
            tax = .008;
            realTax = order * tax;
            total = order * (1 + tax);
            float realTotal = (float)Math.round(total * 100) / 100;
            realTotal1 = String.format("The subtotal is $%.2f \nThe tax is $%.2f \nThe total is $%.2f", order, realTax, realTotal);
        }
        System.out.println(realTotal1);
    }
}
