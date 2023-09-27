package Assingment;
// Print the max value of the array [ 13, 1, -3, 22, 5].

// package Assingment;
import java.util.*;
import java.math.*;

public class maxElemenetOfAnArray {

    public static int maxValue(int[] arr,int Idx){
        if(Idx == arr.length-1){
            return arr[Idx];
        }else{
            int result = maxValue(arr, Idx+1);
            return Math.max(arr[Idx], result); // math.max(a,b) compare the two element  a and b, which is big it was stored into the max function.
        }
    }
    public static void main(String[] args) {
        int arr[] = {13, 1, -3, 22, 5};

        int result = maxValue(arr,0);
        System.out.println("Max value is : " +result);
    }
}
