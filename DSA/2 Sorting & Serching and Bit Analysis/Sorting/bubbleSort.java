// Bubble Sort : in Bubble sort we can compare one by one elements in the arrar and swap if the condition can be satisfied.
// Application : bubble sort

// Time complexity : O(N^2)
// Space complexity : o(1)


import java.util.*;
import java.io.*;

public class bubbleSort {

    // implimantation of an function
    public static void Bubble(int[] arr){
        int temp;
        // for iteration loop
        for(int i=0 ; i<arr.length ;i++){ 
            // for swapping 
            for(int j =i ; j<arr.length-i-1 ; j++){  // Here we wrtite a j<arr.length-i-1 , because after the one interation last value of the indax can higher compare to all the array element so from the second iteration we can ignore the last element in the arr
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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

    // function calling
    Bubble(arr);
    System.out.println("After sorting the array ");
    System.out.println(Arrays.toString(arr));
    }
}


/*

- in bubble sort we can compare all the arr element of an arr one by one and swap from the condition.
- in second for loop we can go to the arr.length-i-1 , because from 1st ieration last element automattically id max of all the elements.
- bubble sort is a stable sort.
------------>>>>>>>>>> Best case : in the bubble sort best case is almost all the element is the incresing order or sorted , means only last element is lower than the all other element in the right way.

----------->>>>>>>>>>> worst case : in the bubble sort worst case is all the element can arrange in the decresing order ,in this case we can swap all the value for all the time  
 */


/*
----------->>>>>>>>>> interview Question : 
                            QUE: How many types you can sort an array
                            ANS: there are two types (i) comparision [bubble sort,Insertion sort ,selection sort] 
                                                    (ii) non-comparision [count sort, redix sort]


                            QUE : for finding a highest element which method we can use.
                            ANS : Bubble sort because after every iteration we have a highest value present in the array and after every iterarion we have a highest values so for finding the highest number we have a bubble sort. 
*/             
