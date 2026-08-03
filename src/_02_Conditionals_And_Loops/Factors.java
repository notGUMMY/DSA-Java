package _02_Conditionals_And_Loops;
// Input a number and print all the factors of that number?
import java.util.*;
public class Factors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to take the Factor: ");
        int count = input.nextInt();
        System.out.println("Factors Are:");
        factor(count);
    }

    static void factor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

}