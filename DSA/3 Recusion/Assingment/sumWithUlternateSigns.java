/*
Given a number n. Find the sum of natural numbers till n but with alternate signs.
That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
Constraints : 0<=n<=1e6
(1).Input1 : n = 10
Output 1 : -5
Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
(2).Input 2 : n = 5
Output 2 : 3
 */

package Assingment;
import java.util.*;

public class sumWithUlternateSigns {

    public static int alterSum(int n){
        int result=0;
        if(n==1){
            return n;
        }
        else if(n%10==0){
            result = (-n) + alterSum(n-1);
            return result;
        }
        else{
            result  = n - alterSum(n-1);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scan.nextInt();

        int result = alterSum(n);
        System.out.println("Alternative sign sum is :" +result);
    }
}
