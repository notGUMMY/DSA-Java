package _01_First_Java_Program;
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Fibonacci {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print("0 ");
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b + " ");
            count++;
        }
    }
}
