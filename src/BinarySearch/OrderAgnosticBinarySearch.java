package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

    int[] arr= {900,100,70,60,30,12,9,5,2,1,0,-1};
    int target = 5;
    System.out.println(OrderAgnosticBinarySearch(arr,target));
}
    static int  OrderAgnosticBinarySearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        boolean isAsec = arr[start]<arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target)
                return  mid;
            if (isAsec) {
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else{
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
