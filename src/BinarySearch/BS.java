package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr = {12,32,45,98,100};
        int target = 100;
        System.out.println((findelement(arr,target,0,arr.length-1)));
    }
    static  int findelement(int[] arr,int target,int start,int end){
        int mid = start + (end-start)/2;
        if(start>end)
            return  -1;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target)
            return findelement(arr,target,start,mid-1);
        else
            return findelement(arr,target,mid+1,end);
    }
}
