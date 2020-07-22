package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args)
    {
    // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmploy = 2;

        // Get what we don't
        System.out.println("Enter the salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number os year with you current employee: ");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if(salary >= requiredSalary)
        {
            if(years >= requiredYearsEmploy)
            {
                System.out.println("Congrats! you are the best");
            }
            else
            {
                System.out.println("Sorry you must have worler at your curent job " + requiredYearsEmploy);
            }

        }
        else
        {
          System.out.println("Sorry, you must ear at least $" + requiredSalary + " This year");
        }



    }


}
