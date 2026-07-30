package _01_First_Java_Program;

import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.
public class Greeting {
    static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("GoodMorning " + name);
    }
}
