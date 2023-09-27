// in this example we find the squre root but in the case  of not a perfect squre we write a floor squre value.
// Application : modification of an binary searching method.

// Time complexity : O(log n base 2)
// space complexity : O(1)

import java.util.*;
import java.io.*;
public class squareRoot {

    public static int square( int sq ){
        int low =0;
        int high = sq;
        int mid;
        int res;
        int temp=0;

        while(low<=high){

            mid = low + (high-low)/2;
            res = mid*mid;
            
            if(res==sq){
                return mid ;
            }
            else if(res<sq){
                // Here we store the mid value in the temp because in any condition we cannot found the perfect squre root we can return the floor root value.
                temp=mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        } return temp;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a squre to find the Squre root : ");
        int sq = scan.nextInt();

        //function calling 
        int s = square(sq);

        if(s==0){
            System.out.println("Floor Squre root is "+s);
        }else{
            System.out.println("The perfect Squre root is : "+s);
        }
    }
}


/*

- in this EX 

step 1 : from the user input we imagin a array of that size. suppose we want a perfect squre root of an 4 then we imagin a [0,1,2,3,4] arr.
step 2 : now we find the mid of this and comapre a 4 to the mid*mid , if mid*mid== 4 then we can directly return the mid value.
step 3 : if this is not equal than we go to the elseif or else condition, we can increse or decrese low or high as a condition .
step 4 : From the binary search if we get a if condition means mid*mid == 4 then we can return a mid directly.
step 5 : but in the case of not perfect squre root means if we enter a 10 then any condition cannot be satisfy so we can store a previos mid as a floor value in the condition of mid*mid < target(10)
step 6 : so in the case of not perfect squre root we return a saveind variable in our case it is a temp.

 */