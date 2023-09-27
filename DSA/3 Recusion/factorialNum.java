// find a factorial number using recursion code

import java.util.Scanner;

class factorialNum{
    // function declaration
    public static int factNum(int n){
        
        //(1) base case condition.
        if(n == 0 || n == 1){
            return 1;
        } 
        
        // (2) Recursive code
        else {
            int result = n * factNum(n-1);
            return result;
        } 
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find a factorial :");
        int a = sc.nextInt();

        // function calling
        int n = factNum(a);
        System.out.println("result is : " +n);
    }
}

// for saw working go to the hand written book.