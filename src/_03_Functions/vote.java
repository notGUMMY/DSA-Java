package _03_Functions;
//Q. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class vote {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        String result =  vote(age);
        System.out.print(result);
    }

    static String vote(int age){
        if (age >= 18){
            System.out.print("Eligible to vote");
        }
        else {
            System.out.print("Not Eligible to vote");
        }
        return "";
    }

}
