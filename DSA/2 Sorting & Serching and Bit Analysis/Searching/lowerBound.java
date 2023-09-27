// Lower Bound : means if two same value present in the same array then first coming(less index) value will be print.
// Application : modification of an binary searching method.

// Time complexity : O(log n base 2)
// space complexity : O(1)

import java.lang.annotation.Target;
import java.util.*;
import java.io.*;

public class lowerBound {

    // implimantation of an funtion
    public static int lower(int []arr , int target){
        int Low = 0;
        int High = arr.length-1;
        int mid;
        int res =(-1);

        while(Low<=High){
            mid = Low + (High - Low)/2;

            if(arr[mid] == target){
                res = mid ;
                High = mid-1; // to chack whether any element present lower than this index we traves the left side of an array. 
            } else if(arr[mid] < target){
                Low = mid + 1 ;
            } else{
                High = mid - 1 ;
            }
        } return res;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Array size");
        int a = scan.nextInt();
        int arr[] = new int[a];
        
        System.out.println("Enter a elements of the an Array");
        for(int i = 0 ; i<a ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter a Target Element : ");
        int target = scan.nextInt();

        // call a function
        int l = lower(arr,target);

        if(l == -1){
            System.out.println("SORRY");
        } else{
            System.out.println("Index : " +l);
        }
    }
}
