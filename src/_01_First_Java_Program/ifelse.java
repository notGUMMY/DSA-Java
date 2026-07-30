package _01_First_Java_Program;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class ifelse {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        float first_number = input.nextFloat();
        System.out.print("Enter 2nd Number: ");
        float second_number = input.nextFloat();
        System.out.print("Choose the operation (+, -, *, /): ");
        String operator = input.next();
        if (operator.equals("+")){
            System.out.println(first_number + second_number);
        } else if (operator.equals("-")) {
            System.out.println(first_number - second_number);
        } else if (operator.equals("*")) {
            System.out.println(first_number * second_number);
        } else if (operator.equals("/")) {
            System.out.println(first_number / second_number);
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}
