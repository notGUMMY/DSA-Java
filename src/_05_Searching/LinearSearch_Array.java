package _05_Searching;
import java.util.*;
public class LinearSearch_Array {
    static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 8;
        int ans = LinearSearch(arr, target);
        System.out.print(ans);
    }

    static int LinearSearch(int arr[] , int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index=0; index<arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
