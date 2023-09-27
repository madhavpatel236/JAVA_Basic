// Approach : selection sort 
// time complexity : O(n^2)
// space complexity : O(1)
// stable sort : no

import java.util.Arrays;

public class selectionort {

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j; // swap
                }
            }
            // here we chack if min_value can change means in intialization min_value is
            // change the this value goes to the in the 0 index and going on.
            if (min_ind != 0) {
                int temp1 = arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i] = temp1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 40, 20, 10, 50, 40 };

        // function calling
        selection(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * in selection sort :
 * 
 * step 1 : in this sort algo we can define a min_value as a i value means in
 * intial condition min_value = i = 0 ;
 * step 2 : in the second for loop we can chack from the i+1 if any element can
 * smaller than the min_value the we directly go this element as a min_value,in
 * our case min_value goes to the index 2.
 * step 3 : after seconnd step our new min_value can once again chake with
 * further remaining elements,in our case min_value is 2 so chake at index at 3
 * and 4 .
 * stap 4 : after travase in the full array min_value chake the (min_value!=0)
 * condition and goes to the ith index means in intiall codition go to the 0th
 * index.
 * step 5 : now our min_value can change to the i means 1 and j=2
 * step 6 : repeat the staps.
 * 
 */

// ------->>>>>>>>>>> selection sort in not a stable sort.

/*
 * --------->>>>>>>>>> interview question:
 * QUE : for finding a minimum element present in the array which method we can
 * use.
 * ANS : selection sort , because in the first iteration we have lowest value of
 * an entire array and after every iteration we have a lowest value of an array.
 */