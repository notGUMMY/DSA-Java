package _00_Projects;
import java.util.Scanner;
public class VIP_customer {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Customer Id: ");
        String customerId = input.nextLine();
        String result = validId(customerId);
        System.out.print(result);
    }
    static String validId(String customerId) {
        if (customerId.startsWith("VIP")) {
            return "VIP Customer";
        }
        return "Regular Customer";
    }
}
