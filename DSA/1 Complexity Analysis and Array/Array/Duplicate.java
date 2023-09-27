// time complexity : O(n)
// space complexity : O(n)

public class Duplicate {
    public static void main(String[] args) {
        int []arr = {1,2,3,3,4,4};
        int n = arr.length;
        boolean flag = true;

        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("No repeted");
        }
    }
}
