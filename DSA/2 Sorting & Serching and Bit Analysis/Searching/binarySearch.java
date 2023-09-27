// Binary Search : 

// Time complexity : O(log n base 2)
// space complexity : O(1)

import java.util.*;
import java.io.*;


public class binarySearch {

    // implimantation of function
    public static int binary(int []arr , int target){

        int Low = 0 ;
        int High = arr.length - 1 ;
        int mid;
        int temp;

        while(Low<=High){
            mid = Low + (High - Low)/2;  // mid = (Low + High)/2

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                High = mid - 1;
            }
            else{
                Low = mid + 1;
            } 
        } return 0;
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

        int f = binary(arr,target);

        if(f == 0){
            System.out.println("SOrry");
        } else{
            System.out.println("Index : " +f);
        }
    }
}


/*  in this method we first we find the mid index of the arr 

step 2: after that we chack the mid is equal to the finding number or not.
step 3: if mid don't equl to the finding number then we search , mid is bigger than the finding number then we will go left side of the arr means we can decrement the value of the high = mid-1.
step 4: if mid do not greter than the given target number than the we go the right side of the mid arr means we increment the value of the low = mid+1.

for time complexity n/(2)^k = 1 solve this eqetation.

- here for finding a mid value we use a mid = low + (High - Low)/2 instand of a (Low + High)/2 because for the big value second eqatation may not contain int value but first eqatation adgest almost in all condition. so recomdation is use first equatation. 
*/