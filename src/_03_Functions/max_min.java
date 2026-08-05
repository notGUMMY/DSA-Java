package _03_Functions;
//Q. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;
public class max_min {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Numbers to Find out the Maximum and the Minimum: ");
        float first = input.nextFloat();
        float second = input.nextFloat();
        float third = input.nextFloat();

        float minimum = (float) min(first,second,third);
        System.out.println("Minium: " + minimum);

        float maximum = (float) max(first,second,third);
        System.out.println("Maximum: " + maximum);

    }

    static float max(float first, float second, float third){
        float Ans = 0;
        if (first > second && first > third){
            Ans = first;
        }
        if (second > first && second > third){
            Ans = second;
        }
        if (third > first && third > second){
            Ans = third;
        }
        return Ans;
    }

    static float min(float first, float second, float third){
        float Ans = 0;
        if (first < second && first < third){
            Ans = first;
        }
        if (second < first && second < third){
            Ans = second;
        }
        if (third < first && third < second){
            Ans = third;
        }
        return Ans;
    }

}
