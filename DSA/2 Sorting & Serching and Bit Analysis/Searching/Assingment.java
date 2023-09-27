/*
 * ------------>>>>>>>>>>>>>>>>>>
 * 
 * Q1. Given an array. Find the number X in the array. If the element is
 * present, return the index of the element,
 * else print “Element not found in array”. Input the size of array, array from
 * user and the element X from user.
 * Use Linear Search to find the element.
 */

import java.util.*;
import java.io.*;
// Approach : Binary search
// TIme complexity : O(log n base 2 )

// public class Assingment {
// // defining the function

// public static int finding(int []arr ,int target){
// int low = 0;
// int high = arr.length-1;
// int mid;
// int temp;

// for(int i = 0 ; i<arr.length ; i++){
// while(low<=high){
// mid = low+ (high -low)/2;

// if(arr[mid]== target){
// return mid;
// }
// else if(arr[mid]< target){
// low = mid + 1;
// }
// else{
// high = mid -1 ;
// }
// }
// } return -1;
// }
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);

// System.out.println("Enter a arary size : ");
// int n = scan.nextInt();
// int arr[] = new int[n];
// System.out.print("Enter a element of an array : ");

// for(int i = 0 ; i<arr.length ; i++){
// arr[i] = scan.nextInt();
// }

// System.out.println("Enter a target element :");
// int target = scan.nextInt();

// // function calling
// int f = finding(arr,target);
// if(f != -1){
// System.out.println("TArget element present in the index no. : " +f);
// }
// else{
// System.out.println("Elemenmt cannot be pressent in the array");
// }
// }
// }

/*------------->>>>>>>>>>>>>>>>>

Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is 
not present return -1.

Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6

Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1

 */

// Approach : Binary search
// TIme complexity : O(log n base 2)

// class Assingment{

// // implimentation of an function
// public static int finding(int []arr , int target){

// for(int i=0 ; i<arr.length ; i++ ){
// int low = 0 ;
// int high = arr.length - 1 ;
// int mid;
// int temp = -1;
// while(low<=high){
// mid = low + (high-low)/2;
// if(arr[mid] == target){
// temp = mid ;
// low = mid+1;
// } else if(arr[mid]<target){
// low = mid + 1;
// } else{
// high = mid -1;
// }
// } return temp;
// } return -1;
// }
// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// int arr[] ={1,1,1,2,3,4,4,5,6,6,6,6};

// System.out.println("Enter a target element :");
// int target = scan.nextInt();

// // function calling
// int f = finding(arr,target);
// if(f != -1){
// System.out.println("Target element present in the index no. : " +f);
// }
// else{
// System.out.println("Elemenmt cannot be pressent in the array");
// }
// }
// }

// Approach : Binary search
// TIme complexity : O(log n base 2)

// class Assingment{

// // implimentation of an function
// public static int finding(int []arr , int target){

// for(int i=0 ; i<arr.length ; i++ ){
// int low = 0 ;
// int high = arr.length - 1 ;
// int mid;
// int temp = -1;
// while(low<=high){
// mid = low + (high-low)/2;
// if(arr[mid] == target){
// temp = mid ;
// low = mid+1;
// } else if(arr[mid]<target){
// low = mid + 1;
// } else{
// high = mid -1;
// }
// } return temp;
// } return -1;
// }
// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// int arr[] ={2,2,2,6,6,18,29,30,30,30};

// System.out.println("Enter a target element :");
// int target = scan.nextInt();

// // function calling
// int f = finding(arr,target);
// if(f != -1){
// System.out.println("Target element present in the index no. : " +f);
// }
// else{
// System.out.println(f);
// }
// }
// }

/*
 * Q3. Given a sorted binary array, efficiently count the total number of 1’s in
 * it.
 * 
 * Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
 * Output 1: 6
 * 
 * Input 2: arr = [ 0 0 0 0 0 1 1]
 * Output 2: 2
 */

// // Approach : linear search
// // Time complexity : O(n)

// class Assingment {

// public static int count(int []arr){
// int count = 0;
// for(int i =0 ; i <arr.length ;i++){
// if(arr[i] == 1){
// count += 1;
// }
// }return count;
// }
// public static void main(String[] args) {
// int arr[]= {0,0,0,0,1,1,1,1,1,1};

// int c = count(arr);
// System.out.println(c);
// }
// }

// Approach : linear search
// Time complexity : O(n)

// class Assingment {

// public static int count(int []arr){
// int count = 0;
// for(int i =0 ; i <arr.length ;i++){
// if(arr[i] == 1){
// count += 1;
// }
// }return count;
// }
// public static void main(String[] args) {
// int arr[]= {0,0,0,0,0,1,1};

// int c = count(arr);
// System.out.println(c);
// }
// }

/*----------------------->>>>>>>>>>>>>>>>>

Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element 
is not found in the array, report that as well.

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 5
Output: Target 5 occurs 3 times

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 6
Output: Target 6 occurs 2 times

*/

// Approach : linear search
// Time complexity : O(n)

// class Assingment {

//     public static void count(int[] arr) {
//         int count = 0;
//         boolean flag = true;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 5) {
//                 count += 1;
//                 flag = false;
//             }
//         }
//         if (flag == false) {
//             System.out.println(count);
//         } else {
//             System.out.println("the element is not found in the array");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };

//         count(arr);
//     }
// }

class Assingment {
    public static void count(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int count = 0;
        int temp;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == 5) {
                count += 1;
            } else if (arr[mid] < 5) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };

        count(arr);
    }
}