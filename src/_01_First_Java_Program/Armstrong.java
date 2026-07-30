package _01_First_Java_Program;

import java.util.Scanner;
//To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the ending number: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int original = num;
            int power = String.valueOf(num).length();
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, power);
                num /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}