package sorting;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[] = {5,2,1,0,8,12,7};
        int[] ans = merge_sort(arr);
        System.out.println(Arrays.toString(arr)); /* original array is not modified indeed it return a new array that contain a
        similar elements of original array but in a sorted manner */
    }
    static int[] merge_sort(int[] arr) {
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;

            int left[] = merge_sort(Arrays.copyOfRange(arr,0,mid));
        /*the things to here know is it actuallly creating new objects for every fucntion call .* original array  is not been modified */
        int right[] = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}