
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solutions;
import java.util.Scanner; //imports Scanner class

public class Solution05 {
    /*
    Write a program that prompts for two numbers.
        create Scanner object 'scan'
        create two String objects 'num1' and 'num2'
        create two int variables 'number1' and 'number2'
        prompt User for 'num1' and 'num2'
        take in 'num1' and 'num2'
            Challenge: dont allow numbers to be negative
                loop that redoes what is above if numbers are negative after parsing
        parse 'num1' and 'num2' to integers
    Print the sum, difference, product, and quotient of those numbers as shown in the example output:
        print 'num1'
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); //create scanner object
        String num1,num2; //create String objects
        int number1,number2; //initialize int variables

        System.out.print("What is the first number? "); //prompt for 'num1'
        num1 = scan.nextLine(); //take in 'num1'
        System.out.print("What is the second number? "); //prompt for 'num2'
        num2 = scan.nextLine(); //take in 'num2'
        number1 = Integer.parseInt(num1);
        number2 = Integer.parseInt(num2);

        while(number1 <0 || number2 < 0 ){ //loop that ensures the values are non-negative

            System.out.println("The numbers need to be non-negative!");
            System.out.print("What is the first number? "); //prompt for 'num1
            num1 =scan.nextLine();
            System.out.print("What is the second number? "); //prompt for 'num2'
            num2 =scan.nextLine();

            number1=Integer.parseInt(num1);
            number2=Integer.parseInt(num2);

        }

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",number1,number2,number1+number2,number1,number2,number1-number2,number1,number2,number1*number2,number1,number2,number1/number2);

    }
}

