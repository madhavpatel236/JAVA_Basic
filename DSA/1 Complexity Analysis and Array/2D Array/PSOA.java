import java.util.*;

// PSOA : prefix sum optimize approach.

// Time complexity : O(m*n)
// space complexity : O(1)

public class PSOA {

    public static void opt(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Traversed a Array in Row wise to calc Row wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
                // arr[i][j] = arrr[i][j] + arr[i][j-1];
            }
        }

        // Traversed a Array in column wise to calc column wise prefix sum
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    // making a new method for query result , this method can be change for other
    // query
    // Time complexity = O(1)
    // spce complexity = O(1)

    public static int res(int[][] arr, int r1, int r2, int c1, int c2) {
        int sum = 0, up = 0, left = 0, repeted_region = 0;

        sum = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeted_region = arr[r1 - 1][c1 - 1];

        int result1 = sum - up - left + repeted_region;
        return result1;
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        System.out.println("Enter a row no. of the first element which ever you want : ");
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();

        System.out.println("Enter a columnn no. of the first element which ever you want : ");
        int c1 = scan.nextInt();

        System.out.println("Enter a row no. of the second element which ever you want : ");
        int r2 = scan.nextInt();

        System.out.println("Enter a columnn no. of the second element which ever you want : ");
        int c2 = scan.nextInt();

        opt(arr);
        int finalResult = res(arr, r1, r2, c1, c2);
        System.out.println(finalResult);

        // for (int[] is : arr) {
        // System.out.println(Arrays.toString(is));
        // }
    }
}

// advantages of this method is we can only change in one method which can
// differ as query can be change but this method's time and space complexity is
// constance means O(1) ,so this cannot affeact in the output
// this method is specially us for big amount of query present in the problume,
// in this case PSBFA have much more time complexity complare to the this
// method. because in this case time complexity is O(m*n) but in the PSBFA time
// complexity is O(NO_QUERY*M*N)