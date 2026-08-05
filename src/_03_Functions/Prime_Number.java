package _03_Functions;
import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = input.nextInt();
        System.out.println("Your Number is " + prime(num));
    }
    static String prime(int num) {
        if (num <= 1) {
            return "Not a Prime Number";
        }
        if (num == 2 || num == 3) {
            return "Prime Number";
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return "Not a Prime Number";
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return "Not a Prime Number";
            }
        }
        return "Prime Number";
    }
}

// OR //

// static String prime(int num) {
//     if (num <= 1) {
//         return "not Prime";
//     }
//     if (num == 2) {
//         return "is Prime";
//     }
//
//     if (num % 2 == 0) {
//         return "not Prime";
//     }
//
//     for(int i = 3; i i <= num; i +=2) {
//         if (num % i == 0) {
//            return "Not Prime";
//         }
//     }
//     return "Prime";
// }