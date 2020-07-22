package chapter3;

/*
this is a IF statement
 */

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] arg)
    {
        //initialize know values
        int salary = 1000;
        int bonus = 250;
        int quotaBonus = 10; // magic number is a hard-code - please always declare numbers



        // Get values for the unknown
        System.out.println("How many sales did the employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        // Quick detour for the bonus earners
        if (sales > quotaBonus)  // boolean type is a true or false
        {
            salary = (salary + bonus);

        }


        // Output
        System.out.println(" The employees say will be : U$" + salary);



    }



}
