package _05_Searching;
import java.util.*;
public class SeachInStrings {
    static void main(String[] args) {
        String name = "GUMMY";
        char target = 'U';
        System.out.print(Search(name, target));
    }

    static Boolean Search(String name, char target){
        if (name.length() == 0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i))
                return true;
        }
        return false;
    }
}
