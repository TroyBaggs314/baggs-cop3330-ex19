package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
public class exercise19
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int height = 0;
        int weight = 0;
        System.out.println("What is your height in inches?");
        while(!sc.hasNextInt())
        {
            String input = sc.next();
            System.out.printf("invalid number.\n");
        }
        height = sc.nextInt();
        System.out.println("What is your weight in pounds?");
        while(!sc.hasNextInt())
        {
            String input = sc.next();
            System.out.printf("invalid number.\n");
        }
        weight = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Your BMI is " + df.format(weightCalc(height, weight)));
        if(weightCalc(height,weight) > 18.5 && weightCalc(height,weight) < 25)
        {
            System.out.println("You are within the ideal weight range");
        }
        else if(weightCalc(height,weight) < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }

    public static double weightCalc(int height, int weight)
    {
        return ((weight*1.0) / (height * (height *1.0))) * 703;
    }
}
