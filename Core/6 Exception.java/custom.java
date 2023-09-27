import java.util.*;

// class MyException extends Exception{
    
//     MyException(){ //constructor.
//     }
//     MyException(String name){ // constructor with parameter.
//         super(name); // parent class(Exception) pase jay atle if ni andar na object ma massage lakhi sakay.
//     }
// }

// class test1{
//     void Ar(){
//         int a = 6;
//         int b = -5;
//         int res;
//         try
//         {
//             if(b<0){ 
//                 Exception obj = new  MyException("DND");
//                 throw obj; // obj name na variable am hay aa massage.
//             }
//             else{
//                 System.out.println(res = a/b);
//             }
//         } 
//         catch(Exception obj){
//             System.out.println(obj.getMessage());
//         }
//     }
// }
// public class custom {
//     public static void main(String[] args) {
//         test1 n = new test1();
//         n.Ar();
//     }
// }








// class CustomException extends Exception{

//     CustomException(){}

//     CustomException(String name){
//         super(name);
//     }
// }

// class Test{
//     public static void main(String[] args) {
        
//         try{
//             throw new CustomException("Madhav");
//         } catch(CustomException obj){
//             System.out.println(obj.getMessage()+ "Patel");
//         }
//     }
// }





// class myException extends Exception{

//     myException(){}
//     myException(String message){
//         super(message);
//     }
// }


// class custom{

//     public static void main(String[] args) {
//         System.out.println("Enter a age : ");
//         Scanner scan = new Scanner(System.in);
//         int age = scan.nextInt();
//         try{
//             if(age<18){
//                 throw new myException("You are not Eligable for voting");
//             } else {
//                 System.out.println("Go for vothing");
//             }
//         } catch(myException obj){
//             System.out.println(obj.getMessage());
//         }
//         System.out.println("Thank you");
//     }
// }







