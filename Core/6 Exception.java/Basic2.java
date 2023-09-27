import java.util.*;

/* --------->>>>>>>>>>>>>>>>>> throw: The throw keyword is used to transfer control from the try block to the catch block. 

------------->>>>>>>>>>>>>>>>> throws: The throws keyword is used for exception handling without try & catch block. It specifies the exceptions that a method can throw to the caller and does not handle itself.

 */



// multiple catch blocks


// class Basic2{
//     public static void main(String[] args) {
        
//         int a = 6 ;
//         int b = 0 ;

//         try{
//             int Divison =  a/b;
//             System.out.println("Done..");
//         }
//         catch(ArithmeticException obj){
//             System.out.println("ArithmeticException");
//         }
//         catch(ArrayIndexOutOfBoundsException obj){
//             System.out.println("ArithmeticException");
//         }
//         catch(Exception obj){
//             System.out.println("Exception");
//         }
//     }
// }


// class A{
//     void chack(){

//         int arr[]={10,34,65};
//         System.out.println("Enter arr location : ");
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();

//         System.out.println("Enter the number Which you can Divide : ");
//         Scanner scan1 = new Scanner(System.in);
//         int b = scan1.nextInt();

//         try {
//             int result = arr[a] / b ;
//         } catch (ArithmeticException obj) {
//             System.out.println("ArithmeticException" +obj.getMessage());
//         } catch (ArrayIndexOutOfBoundsException obj) {
//             System.out.println("ArrayIndexOutOfBoundsExcepation" +obj.getMessage());
//         } catch (Exception obj) {
//             System.out.println("Exception");
//         }
//         System.out.println("Rest of code");
//     }
// }

// class Basic2{
//     public static void main(String[] args) {
//         A ch = new A();
//         ch.chack();
//     }
// }










// // Nested catch block



// class Basic2{
//     public static void main(String[] args) {
        
//         try{
//             int arr[] = new int[2];
//             // System.out.println(arr[5]);
//             // nested try block
//             try{ 
//                 int Divison = 110 / 2;
//                 System.out.println(Divison);
//             } catch(ArithmeticException obj) {
//                 System.out.println("inner try-catch was executed");
//             }
//         } catch (ArrayIndexOutOfBoundsException obj){
//             System.out.println("outer catch was executed");
//         }
//     }
// }









// class Basic2{
//     public static void main(String[] args) {
        
//         try{
//             int arr[] = new int[2];
//             // System.out.println(arr[5]);
//             // nested try block
//             try{ 
//                 int Divison = 110 / 0;
//                 System.out.println(Divison);
//             } catch(ArithmeticException obj) {
//                 System.out.println("inner try-catch was executed");
//             } finally{
//                 System.out.println("inner finally");
//             }
//         } catch (ArrayIndexOutOfBoundsException obj){
//             System.out.println("outer catch was executed");
//         } finally{
//             System.out.println("outer finally");
//         }
//     }
// }






