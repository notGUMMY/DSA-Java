package _01_First_Java_Program;
//Input currency in rupees and output in USD.
import java.util.Scanner;
public class INR_to_USD {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Rupees: ");
        float INR = input.nextFloat();
        float USD = (float) (INR * 0.01036120);
        System.out.print("USD: " + USD);
    }
}
