import java.util.Arrays;

/*  
--------->>>>>>>>>>>>>>>> Write a program to print the sum of all the elements present on even indices in the given array.

Input 1: arr[] = {3,20,4,6,9}
Output 1: 16

Input 2 : arr[] = {4,3,6,7,1}
Output 2 : 11
*/

// // Time complexity : O(n)
// // Space complexityv : O(1)
// public class Assingment {
//     public static void main(String[] args) {
//         int [] arr ={3,20,4,6,9};
//         int sum = 0;

//         for(int i=0; i<arr.length ; i++)
//         if (i % 2 == 0 ) {
//             sum += arr[i]; 
//         }System.out.println(sum);
//     }
// }



// // Time complexity : O(n)
// // Space complexity : O(1)
// public class Assingment {
//     public static void main(String[] args) {
//         int [] arr ={4,3,6,7,1};
//         int sum = 0;

//         for(int i=0; i<arr.length ; i++)
//         if (i % 2 == 0 ) {
//             sum += arr[i]; 
//         }System.out.println(sum);
//     }
// }








/*
------------>>>>>>>>>>>> Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.

Input 1: arr[] = {34,21,54,65,43}
Output 1: 34 54 


Input 12: arr[] = {4,3,6,7,1}
Output 2: 4 6
 */

// //Time complexity : O(n)
// //Space complexity : O(1)
// public class Assingment{
//     public static void main(String[] args) {
        
//         int []arr = {34,21,54,65,43};
        
//         for (int i : arr) {
//                 if(i % 2 == 0){
//                     System.out.print(i+ " ");
//                 }
//         }
//     }
// }



// //Time complexity : O(n)
// //Space complexity : O(1)
// public class Assingment{
//     public static void main(String[] args) {
        
//         int []arr = {4,3,6,7,1};
        
//         for (int i : arr) {
//                 if(i % 2 == 0){
//                     System.out.print(i+ " ");
//                 }
//         }
//     }
// }







/*
-------->>>>>>>>>>>> Q3: Write a program to calculate the maximum element in the array.

Input 1  : arr[] = {34,21,54,65,43}
Output 1 : 65

Input 2  : arr[] = {4,3,6,7,1}
Output 2 : 7
 */


public class Assingment{
    public static void main(String[] args) {
        
        int arr[] ={34,21,54,65,43};
        int n = arr.length;
        boolean flag = true;

        for(int i=0 ; i<n ; i++){
            for(int j=1 ; j<n ; j++){
                
                if(arr[i]>arr[j]){

                }
            }
        }
    }
}