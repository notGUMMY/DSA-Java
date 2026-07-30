package _01_First_Java_Program;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
public class Odd_Even {

    static void main(String[] args) {

        System.out.print("Enter A Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
