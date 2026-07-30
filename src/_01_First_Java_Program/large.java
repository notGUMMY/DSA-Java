package _01_First_Java_Program;
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class large {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter Second Number: ");
        float num2 = input.nextFloat();
        if (num1 > num2){
            System.out.print(num1 + " is The Largest");
        }
        else {
            System.out.print(num2 + " is The Largest");
        }
    }
}
