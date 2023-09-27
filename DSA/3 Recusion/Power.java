
import java.util.*;

// // Brute force approch :
// //Aa method Brute force che optimize nathi because ama time complexity direct j b par dependant che jo b ni value bov j vadhare hase to pachi time vadhi jase because of the recursive turms.
// // time complexity : O(b)

// public class Power {

//     // function defination
//     public static int powerNum(int a, int b){
        
//         //(1) base case condition : because of the game teni power ma 1 hoy to pachi teni value a jetlij thay.
//         if(b==1){
//             return a;
//         } 
        
//         // (2) Recursive calls : aya time complexity issue male because jo b ni value high hoy to tetli var mate exicution thay and time complexity vadhi jay
//         else {
//             int result = a * powerNum(a, b-1);
//             return result;
//         }
//     }
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number A and B :");
//         int a = sc .nextInt();
//         int b = sc.nextInt();

//         // function calling
//         int res = powerNum(a,b);
//         System.out.println("Result is :" +res);
//     }
// }



// optimal approach : for more understanding go to the hand written book.

class Power{

    public static int powerNum(int a , int b){
        if(b==1){
            return a;
        }else{
            // supppose a=2 ,b=16
            int mid=b/2; // mid = 2^8 and 2^8
            int result = powerNum(a, mid); // result is only ans of one 2^8
            int finalresult = result * result; // in finalresult we get a ans of 2^8 * 2^8 
            
            if(b%2 == 0){
                return finalresult;
            }else{ // suppose a=2 , b=17
                return a*finalresult; // 2 * result of 2^16
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A and B :");
        int a = sc .nextInt();
        int b = sc.nextInt();

        // function calling
        int res = powerNum(a,b);
        System.out.println("Result is :" +res);

    }
}


