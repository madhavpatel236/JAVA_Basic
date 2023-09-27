public class findSubset {

    public static void Subset(String str , String ans ,int Idx){
        // Base condition
        if(Idx == str.length()){
            System.out.println(ans);
            return;
        }
        // Recursive calls  
        Subset(str, ans + str.charAt(Idx) , Idx+1); // Yes condition 
        Subset(str, ans, Idx+1);  // no condition  
    }
    public static void main(String[] args) {
        String str = "abc";

        Subset(str,"",0);
    }
}
