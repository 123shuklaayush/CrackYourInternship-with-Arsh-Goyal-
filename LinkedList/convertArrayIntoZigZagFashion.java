package DSAsheetByArsh.LinkedList;

import java.util.Arrays;

public class convertArrayIntoZigZagFashion {
    public static void zigZag(int arr[], int n){
        // Code your solution here.
        int i = 0;
        int j = 2;
        int k = 1;
        while ( j < arr.length ){
            while(arr[i] > arr[j] && arr[k] > arr[j]){
                j++;
            }

            swap(arr,k,j);
            i+=2;
            j++;
            k+=2;
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
