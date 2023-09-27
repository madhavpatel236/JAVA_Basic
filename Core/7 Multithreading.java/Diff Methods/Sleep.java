import java.net.Socket;

/*

------------>>>>>>>>>>>> The method sleep() is being used to halt the working of a thread for a given amount of time. After the sleeping time is over, the thread starts its execution from where it has left.


------------>>>>>>>>>>>> Syntax : Thread.sleep(Time in ms);
                        Syntax :  Thread.sleep(Time in ms) throws interruptException;


------------>>>>>>>>>>>> Sleep keyword always throws intruptedException.so we can always try to weite a sleep keyword in the try-catch block.another way to control Exception is throws interuptException directly


------------>>>>>>>>>>>> Parameters:
                            The following are the parameters used in the sleep() method.
                                (i) mls: The time in milliseconds is represented by the parameter mls. The duration for which the thread will sleep is given by the method sleep().
                                (ii) n: It shows the additional time up to which the programmer or developer wants the thread to be in the sleeping state. The range of n is from 0 to 999999.
                                        The method does not return anything.


------------>>>>>>>>>>>> 


 */




// // Sleep use in main THread or Method.

// class Sleep{
//     public static void main(String[] args) {
//         try {
//             for(int i = 0 ; i <= 10 ; i++){
//                 System.out.println(i);
//                 Thread.sleep(2000);
//             }
//         } catch (InterruptedException obj ) {
//             System.out.println(" some Error!!");
//         }
//     System.out.println("In main method/Thread ");
//     }
// }









// // When sleep time is Negetive. 

// class Sleep{
//     public static void main(String[] args) {
//         try {
//             for(int i = 0 ; i <= 10 ; i++){
//                 System.out.println(i);
//                 Thread.sleep(-2000);
//             }
//         } catch (InterruptedException obj ) {
//             System.out.println(" some Error!!"+obj.getMessage());
//         }
//     System.out.println("In main method/Thread ");
//     }
// }





// // sleep() use in child Thread or Method.

// class Sleep implements Runnable{
//     public void run(){
//         try {
//         System.out.println("In run method");
//         Thread.sleep(2000);
//         System.out.println("Apply the sleep() ");
//         } catch(InterruptedException obj){
//             System.out.println("Some Error!!");
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("In the main method");
//         Sleep s = new Sleep();
//         Thread t1 = new Thread(s);
//         t1.start();
//     }

// }









// class Sleep implements Runnable{
//     public void run(){

//         for(int i = 1 ; i<=5 ; i++){
//             try{
//             System.out.println(i);
//             Thread.sleep(2000);
//             }catch(InterruptedException obj){
//                 System.out.println("Some Error!!");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Sleep s = new Sleep();
//         Thread t = new Thread(s);
//         t.start();
//     }
// }






