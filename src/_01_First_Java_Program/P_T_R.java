package _01_First_Java_Program;

import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class P_T_R {


    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Principal: ");
        float Principal = input.nextFloat();
        System.out.println("Enter Time: ");
        float Time = input.nextFloat();
        System.out.println("Enter Rate");
        float Rate = input.nextFloat();

        float Simple_interest = Principal * Time * Rate / 100;
        System.out.println(Simple_interest);
    }
}