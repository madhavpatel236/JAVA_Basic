// need at a base condition [1,2,3,4,5]
// need after  a recursion ot backtraking [-1,0,1,2,3]
// time complexity : O(n)
// space complexity : O(n)

import java.util.Arrays;

public class BackArrays {
    public static void backtrack(int[] arr,int Idx,int val){
        // base condition
        if(Idx == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        // Recursive call 
        arr[Idx] = val;
        backtrack(arr, Idx+1,val+1); // recursive call
        arr[Idx] = arr[Idx] - 2; // backtraking step
    }

    // for printing a backtraking array.
    public static void printArr(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
        } System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        
        // function calling
        backtrack(arr,0,1);
        printArr(arr);
    }
}
