// Find the sum of the values of the array [92, 23, 15, -20, 10].


package Assingment;

public class sumOfArrayElements {

    public static int sumOfTheArary(int[] arr ,int n){
        if(n<1){
            return arr[n];
        } else{
            int result = arr[n]+ sumOfTheArary(arr, n-1);
            return result;
        }
    }
    public static void main(String[] args) {
        int arr[] = {92, 23, 15, -20, 10};
        int n = arr.length-1;

        int res = sumOfTheArary(arr,n);
        System.out.println("sum is "+res);
    }
}
