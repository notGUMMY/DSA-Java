package _04_Arrays;

import java.util.Arrays;

public class Swap {

    static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 5);
        System.out.println("Modified Array");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
