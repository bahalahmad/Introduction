package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int peak = peakinMountainArray(arr);
        int ans = orderAgnosticSearch(arr,0,peak,target);
        if(ans!=-1)
            System.out.println(ans);
        else {
            System.out.println(orderAgnosticSearch(arr,peak+1,arr.length-1,target));
        }
    }
    static int peakinMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return  start;
    }
    static int orderAgnosticSearch(int[] arr, int start, int end,int target) {
        boolean isasec = arr[0]<arr[arr.length-1];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isasec) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else
                    return mid;
            }
            else {
                if (arr[mid] > target) {
                    start = mid - 1;
                } else if (arr[mid] < target) {
                    end = mid + 1;
                } else
                    return mid;
            }
        }
        return  -1;
    }
}
