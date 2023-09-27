// Given an integer, find out the sum of its digits using recursion.

package Assingment;

public class sumOfDigits {

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            int result = n%10 + sum(n/10); // after first iteration: 4+123
            return result;
        }

    }
    public static void main(String[] args) {
            int num =1234;
            int n = sum(num);
            System.out.println("The sum is : "+n);
    }
}
