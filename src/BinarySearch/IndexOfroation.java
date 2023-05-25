package BinarySearch;

public class IndexOfroation {
    public static void main(String[] args) {
        int[] arr = {10,12,2,4,5,7,8,9};
        System.out.println(findindex(arr));
    }
    static  int  findindex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

