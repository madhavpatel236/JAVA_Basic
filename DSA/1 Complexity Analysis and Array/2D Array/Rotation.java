/*
- for rotation we have firstly convert rows into the column and after that we swap the column for final result.

 */


// Time complexity : O(m*n)
// Space complexiy : O(1)

import java.util.*;

/*

[1,2,3,4]
[5,6,7,8]
[9,10,11,12]
[13,14,15,16]

ANS :

[13,9,5,1]
[14,10,6,2]
[15,11,7,3]
[16,12,8,4]

 */

public class Rotation {
    public static void rarray(int[][] arr){
        int m = arr.length;
        int n = arr[0].length; // 0th mi row ni length atle no. of column mali jay.

        // Step 1 : Transfar rows into the column.

        for(int i = 0 ; i<m ; i++){
            for(int j = i ; j<n ; j++){ // Here we use j = i because if we use j=0 then each value can swap two times so matrix cannot be rotate.
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        /*
        Ans :
        [1,5,9,13]
        [2,6,10,14]
        [3,7,11,15]
        [4,8,12,16]
         */

        // step 2 : Swap the each column means , firstColumn<->lastColumn , secondColumn<->secondLastColumn

        for(int i = 0 ; i<m ; i++){
            int firstIndex = 0;
            int lastIndex = n-1;

            while(firstIndex < lastIndex){
                int temp = arr[i][firstIndex];
                arr[i][firstIndex] = arr[i][lastIndex];
                arr[i][lastIndex] = temp;

                firstIndex ++;
                lastIndex --;
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // function create and pass the array arr.
        rarray(arr);

        for (var temp : arr) {
            System.out.println(Arrays.toString(temp)); // Because for displaying the array specific with []brackets (,) usin coma to sapereate the elements we use Arrays.toString(array_name) 
            // System.out.println(temp);
        }
    }
}
