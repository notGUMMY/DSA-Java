package _02_Conditionals_And_Loops;
import java.util.Scanner;
public class Area_Of_Rectangle {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        float l = input.nextFloat();
        System.out.print("Enter Breadth: ");
        float b = input.nextFloat();
        float result = details(l,b);
        System.out.print("Area Of Rectangle is " + result);
    }

    static Float details(float l, float b) {
        float Area = l * b;
        return Area;
    }
}
