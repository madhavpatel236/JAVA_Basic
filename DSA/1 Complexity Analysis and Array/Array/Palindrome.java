import java.util.Arrays;
import java.util.Scanner;
/*
 */
// palindrome means if we revese the element then we see that that is also same as givan simple array.

// // Method : 1
// // Time complexity : O(n)
// // Space complexity : O(1)

class Palindrome{
        
    public static void main(String[] args) {
        int Elements[] = {1,2,3,2,1};
        int n = Elements.length;

    for(int i = 0 ; i<n/2 ; i++){
        if (Elements[i] != Elements[n-1-i]) {
            System.out.println("Not a palindrome");
            break;
        } else {
            System.out.println("This is Palindrome");
            break;
            }
        }
    }
}


// mid ni left and right side na element ne khali compare kayra same che ke nahi
// [ 1,2,3,2,1 ] ama 3 ni left ni left and right side ni value chake karva ni khali for example i=0 and i= 4 e same che ke nahi and pachi i=1 and i=3 e same che ke nahi, jo te same hase to palindrome thase j. 
