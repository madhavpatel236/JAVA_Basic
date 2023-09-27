public class Permutation {

    public static void Finding(String str , String ans){
        // Base case Condition
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // Recursion call
        for(int i = 0 ; i<str.length() ; i++){
            char curent = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            Finding(NewStr , ans+curent);
        }

    }
    public static void main(String[] args) {
        String str = "abc";

        Finding(str,"");
    }
}
