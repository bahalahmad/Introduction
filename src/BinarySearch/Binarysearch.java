package BinarySearch;
public class Binarysearch {
    public static void main(String[] args) {
        int[] arr= {1,4,7,9,10,14,15,18,30};
        int target = 180;
        System.out.println(binarysearch(arr, target));
    }
    static int  binarysearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target)
                end = mid-1;
            else if(arr[mid]<target)
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
