/* 

---------------->>>>>>>>>>>>>>> Synchronization in Java :
                                    - Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
                                    - Java Synchronization is better option where we want to allow only one thread to access the shared resource.


---------------->>>>>>>>>>>>>>> Why use Synchronization?
                                    -The synchronization is mainly used to
                                        (i)To prevent thread interference.
                                        (ii)To prevent consistency problem.

---------------->>>>>>>>>>>>>>> Types of Synchronization:
                                    - There are two types of synchronization
                                        (i)Process Synchronization
                                        (ii)Thread Synchronization
                                            Here, we will discuss only thread synchronization

---------------->>>>>>>>>>>>>>> Thread Synchronization
                                    There are two types of thread synchronization mutual exclusive and inter-thread communication.
                                        (i) Mutual Exclusive
                                            - Synchronized method.
                                            - Synchronized block.
                                            - Static synchronization.
                                        (ii) Cooperation (Inter-thread communication in java)



---------------->>>>>>>>>>>>>>> Concept of Lock in Java
                                        - Synchronization is built around an internal entity known as the lock or monitor.
                                        Every object has a lock associated with it. By convention, a thread that needs 
                                        consistent access to an object's fields has to acquire the object's lock before
                                        accessing them, and then release the lock when it's done with them.
                                        - From Java 5 the package java.util.concurrent.locks contains several lock implementations.



---------------->>>>>>>>>>>>>>> in short with the help of the Synchronization we can lock the process resource or we can say we can achive the consistency.


 */










// // ---------->>>>>>>>>>> First we will Write a code Without using a sychronize keyword
// // here we can see this in the output there are inconsistancy because of sleep method in the output we get not serial output from the one class.


// class Test extends Thread{
//     public void run(){
//         for(int i= 0 ; i<=10 ; i++){
//             try{
//             System.out.println(i);
//             Thread.sleep(3000);
//             }catch(InterruptedException obj){
//                 System.out.println(obj.getMessage());
//             }
//         }
//     }
// }
// class Test1 extends Thread{
//     public void run(){
//         for(int i= 190 ; i<=200 ; i++){
//             try{
//             System.out.println(i);
//             Thread.sleep(1000);
//             }catch(InterruptedException obj){
//                 System.out.println(obj.getMessage());
//             }
//         }
//     }
// }
// class Theory{
//     public static void main(String[] args) {
//         Test t = new Test();
//         Test1 t1 = new Test1();
//         t.start();
//         t1.start();
//     }
// }



//------------>>>>>>>>>>> now upper program try with syncronize keyword and see output.

// class Test extends Thread{
//     synchronized public void run(){
//         for(int i= 0 ; i<=10 ; i++){
//             try{
//             System.out.println(i);
//             Thread.sleep(3000);
//             }catch(InterruptedException obj){
//                 System.out.println(obj.getMessage());
//             }
//         }
//     }
// }
// class Test1 extends Thread{
//     public void run(){
//         for(int i= 190 ; i<=200 ; i++){
//             try{
//             System.out.println(i);
//             Thread.sleep(1000);
//             }catch(InterruptedException obj){
//                 System.out.println(obj.getMessage());
//             }
//         }
//     }
// }
// class Theory{
//     public static void main(String[] args) {
//         Test t = new Test();
//         Test1 t1 = new Test1();
//         t.start();
//         t1.start();
//     }
// }