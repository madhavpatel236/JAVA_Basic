// finding a fibonacci series of a giving number.
// fibonacci series : 0,1,1,2,3,5,8,13.......
// time complexity : O(2^n)
// space complexity : O(n)

import java.util.*;

class fibonacciSeries{

    // function defination
    public static int fibonacci(int n){
        // (1) base condition
        if(n==0 || n==1){
            return n;
        }
        // (2) recursive calls
        else{
            int result = fibonacci(n-1) + fibonacci(n-2);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to find a Fibonacci series : ");
        int n = sc.nextInt();

        // function calling
        int res = fibonacci(n);
        System.out.println("Result is : " + res);
        
        
    }
}

// for more understanding go to the hand written book.