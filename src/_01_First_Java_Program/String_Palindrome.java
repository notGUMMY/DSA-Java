package _01_First_Java_Program;

import java.util.Scanner;
//To find out whether the given String is Palindrome or not.
public class String_Palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word = input.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)){
            System.out.print("It is a Palindrome");
        }

        else {
            System.out.print("It is not a Palindrome");
        }
    }
}
