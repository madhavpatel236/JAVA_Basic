import java.lang.reflect.Array;

// method 1 : in this method we use a loop for sum so space complexity is
// increasing compare to the second method.
// Time complexity : O(n)
// Space complexity : O(n)

// public class missing {
//     public static void main(String[] args) {
//         int sum = 0;
//         int sum1 = 0;
//         int missNo;
//         int arr[] = { 1, 2, 3, 5, 6 };
//         int n = Array.getLength(arr);

//         for (int i = 0; i <= n + 1; i++) { // total sum for (n+1) numbers.
//             sum1 = sum1 + i;
//         }
//         for (int i = 0; i < n; i++) { // total sum of givan array.
//             sum = sum + arr[i];
//         }

//         if (sum != sum1) {
//             missNo = sum1 - sum;
//             System.out.println(missNo);

//         } else {
//             System.out.println("There are no missing number.");
//         }
//     }
// }

// // Method 2 : Here we use a Standard formula instands of for loop so Space
// complexity reduce compare to method1(looping method).
// // Time complexity : O(n)
// // Space complexity : O(1)

public class missing {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int missNo;
        int arr[] = { 1, 2, 3, 5, 6 };
        int n = arr.length;

        sum1 = (n + 1) * (n + 2) / 2; // Standard formula fo sum=n(n+1)/2 for reducing the

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        if (sum != sum1) {
            missNo = sum1 - sum;
            System.out.println(missNo);
        } else {
            System.out.println("There are no missing number.");
        }
    }
}
