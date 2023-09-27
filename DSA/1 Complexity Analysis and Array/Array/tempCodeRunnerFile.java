
class Palindrome{
        
    public static void main(String[] args) {
        int Alements[] = {1,2,3,2,1};
        int n = Alements.length;

    for(int i = 0 ; i<n/2 ; i++){
        if (Alements[i] != Alements[n-1-i]) {
            System.out.println("Not a palindrome");
            break;
        } else {
            System.out.println("This is Palindrome");
            break;
            }
        }
    }
}