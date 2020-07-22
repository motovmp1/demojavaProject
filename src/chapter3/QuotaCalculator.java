package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] arg)
    {
        // initialize values we know
        int quota = 10;

        // get unknown values
        System.out.println("Please enter the sells value: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        // Make a decision on the path to take
        if(sales >= quota) // is one statement you can omit that
        {
            System.out.println("Congrats! you have meet the quota.");
        }
        else
        {
            int salesShort = (quota - sales);
            System.out.println("Sorry! You do not have to get the score.");
            System.out.println("This is the quantity missing to sell: " + salesShort);
        }

    }
}
