package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;
public class FindfirstAndLastElement {
    public static void main(String[] args) {
        int[] arr= {1 ,3 ,5 ,5 ,5 ,5 ,67 ,123 ,125};
        int target = 5;
        range(arr,target);
    }
    static void range(int[] arr, int target){
            int[] ans = {-1,-1};
            ans[0] = find(arr,target,true);
            if(ans[0]!=1)
                ans[1] = find(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }
    static  int find(int[] arr, int target,boolean istrue) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <=end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else {
                ans = mid;
                if (istrue)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
