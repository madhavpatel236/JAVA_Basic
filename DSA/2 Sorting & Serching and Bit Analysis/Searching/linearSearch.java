// Linear Searching : here we chack a one by one element in the array to search the target element.

// Time complexity : O(n)
// Space complexity : O(1)

import java.util.*;
import java.io.*;

public class linearSearch{
    public static void main(String[] args) {
        int temp =0 ;
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

        for(int i=0 ; i<a ; i++){
            if(arr[i] == target){
                temp = i ;
                break;
            } 
        } 
        
        if(temp == 0){
            System.out.println("Sorry");
        } else{
            System.out.println("Index : " +temp);
        }
    }
}


// in this method biggest problume for a big size array, because when a size was so large than time complexity can increase so this is efficient way to search an element in the array.