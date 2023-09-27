import java.util.*;
import java.io.*;
// // PSBFA = prifix sum brute force approach

/*
- in this method we can go specific element to the spacific element and sum in between this elements.
 */

// Time complexity : O(m*n)
// Space comlexity : O(1)


public class PSBFA {

    public static int brute(int[][] arr ,int r1, int r2 , int c1, int c2){
        int sum = 0;
        for(int i=r1 ; i<=r2 ; i++){
            for(int j=c1 ; j<=c2 ; j++){
                sum += arr[i][j];
            }
        }return sum;
    }
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        
        System.out.println("Enter a row no. of the first element which ever you want : ");
        Scanner scan = new Scanner(System.in);
        int r1  = scan.nextInt();

        System.out.println("Enter a columnn no. of the first element which ever you want : ");
        int c1  = scan.nextInt();

        System.out.println("Enter a row no. of the second element which ever you want : ");
        int r2  = scan.nextInt();

        System.out.println("Enter a columnn no. of the second element which ever you want : ");
        int c2  = scan.nextInt();

        // brute(arr, r1, r2, c1, c2); // use if we use a void in brute method.
    
        int result = brute(arr,r1,r2,c1,c2);
        System.out.println(result);
    }
}


// but in this method one of the biggest problume is here we have 4*4 array and only one query suppose if we have 100*100 array and we have multiple query then for each sum we create saperate 2 for loops and then time complexity can increase so this is not a good way to find sum.