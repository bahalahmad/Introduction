package LinearSearch;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchLinear1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements of an Array");
        for(int i=0; i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(linearSearch(arr,5) );
    }
    static  int linearSearch(int[] arr,int target){
        if(arr.length==0)
            return Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return target;
        }
        return Integer.MAX_VALUE;
    }
}
