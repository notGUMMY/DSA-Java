package _02_Conditionals_And_Loops;
// Area Of Triangle
import java.util.Scanner;
public class Area_Of_Triangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float Base = input.nextFloat();
        System.out.print("Enter Height: ");
        float Height = input.nextFloat();
        double Ans = (float) (0.5*Base*Height);
        System.out.print("Area of Triangle: " + Ans);
    }
}
