package _02_Conditionals_And_Loops;
//Area Of Circle
import java.util.Scanner;
public class Area_Of_Circle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        float radius = input.nextFloat();
        double area = 3.14159*radius*radius;
        System.out.print("Area of Circle is: " + area);
    }
}
