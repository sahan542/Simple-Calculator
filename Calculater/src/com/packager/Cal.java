package com.packager;

import java.util.*;
class cal{
    public static double sum( double num1,  double num2){
        double total = num1+num2;
        return total;
    }
    public static double difference( double num1,  double num2){
        double dif = num1-num2;
        return dif;
    }
    public static double multiplication( double num1, double num2){
        double multi = num1*num2;
        return multi;
    }
    public static double divide( double num1,  double num2){
        double divide = num1/num2;
        return divide;
    }

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        double answer = 0 ;
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Press num1 for sum");
        System.out.println("Press num2 for subtraction");
        System.out.println("Press num3 for multiplication");
        System.out.println("Press num4 for division");
        System.out.println("\n");

        System.out.println("What do you want to do - ");
        int a = input.nextInt();
        System.out.println("\n");
        System.out.print("Enter your first number = ");
        double num1 = input.nextInt();
        System.out.println("Enter your second number = ");
        double num2 = input.nextInt();

        switch (a) {
            case 1:
                answer = sum(num1,num2);
                break;
            case 2:
                answer = difference(num1,num2);
                break;
            case 3:
                answer = multiplication(num1,num2);
                break;
            case 4:
                answer = divide(num1,num2);
                break;
            default:
                System.out.println("You have entered a wrong entry");
        }
        System.out.println("The  answer is = "+answer);

    }
}