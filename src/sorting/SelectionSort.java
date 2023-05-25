package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1,3,-2,0,6,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = findmax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
    static int findmax(int[] arr, int first,int last){
        int max = first;
        for(int i=first+1;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
