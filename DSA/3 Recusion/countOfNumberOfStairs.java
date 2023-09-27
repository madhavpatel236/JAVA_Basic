// in this example we find a how many ways to climb the stairs. and maximum we will climb at the one time is 1 or 2. so if we claimb 3 stairs then we have 3 ways (1,1,1),(1,2),(2,1). for more understanding go to the handwriting book.  
// time complexity : O(2^n)
// space complexity : O(n)
import java.util.*;

public class countOfNumberOfStairs {

    public static int climbWay(int n){
        if(n==1 || n==2){
            return n;
        } else{
            int result = climbWay(n-1) + climbWay(n-2);
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number of stairs to we claimb : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = climbWay(n);
        System.out.println("Number of ways is : " +res);
        
    }
}
