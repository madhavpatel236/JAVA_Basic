// Approach : Insertion sort 

// time complexity: O(n^2)
// space complexity: O(1)

import java.util.Arrays;

public class insertionSort {

    // function implimentation
    public static void insertion(int arr[]){
        for(int i = 1 ; i< arr.length ; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--; // j-- kayro means ke j ni value swap kayra pachi navo elemet j par ayvo hase te fari thi  chake thse tene pele element sathe.
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {50,40,20,30,100};

        // function calling
        insertion(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}


/*

- in insertation sort we have start loop from the 1 and comapre the element present in the index 0 ,if index 1 element can be lower than the index 0 then it can swap the value. this process will repeted again from the index 2 chake with index 1 and after that index 0.
- insertion sort is a stable sort.
-------------->>>>>>>>>>>>>>>>> insertion sort can write a lowest value on the left side of an array after each iteration

 */