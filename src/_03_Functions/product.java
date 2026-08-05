package _03_Functions;
//Q. Define a method that returns the product of two numbers entered by user.
import java.util.*;
public class product {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Numbers: ");
        float a = input.nextFloat();
        System.out.print("Enter Second Numbers: ");
        float b = input.nextFloat();
        System.out.print("Product: " + product(a,b));
    }
    static float product(float a, float b){
        float result = a*b;
        return result;
    }
}
