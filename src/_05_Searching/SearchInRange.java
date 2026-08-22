package _05_Searching;

//Q. search for 3 in the range of Index [1 to 4]

import java.util.*;
public class SearchInRange {
    static void main(String[] args) {
        int[] arr = {18, 12, -7, 14, 3, 28};
        int target = 3;
        int ans = LinearSearch(arr, target, 1, 4);
        System.out.print(ans);
    }

    static int LinearSearch(int arr[] , int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index=start; index<=end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
