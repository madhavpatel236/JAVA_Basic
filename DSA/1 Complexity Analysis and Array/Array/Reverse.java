// Time complexity  : O(n)
// Space complexity : O(1)

public class Reverse {
    public static void main(String[] args) {
        
        int Alements[] = {1,2,3,4,5,6,7,8};
        int n = Alements.length;

        for(int i = 0 ; i<n/2 ; i++){
            // Swap the values of First element and last elements in array.
            int Temp = Alements[i];
            Alements[i] = Alements[n-1-i];
            Alements[n-1-i] = Temp;
        }
        System.out.println("Reverse of an array is : ");
    
        for(int i = 0 ; i<n ; i++){
            System.out.print(Alements[i]+ " ");
        }
    }
}
