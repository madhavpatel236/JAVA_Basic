import java.rmi.server.SocketSecurityException;

import javax.sound.midi.Soundbank;

/* 

---------------->>>>>>>>>>>>> Java join() method: 
                                    The join() method in Java is provided by the java.lang.Thread class that
                                    permits one thread to wait until the other thread to finish its execution. 
                                    Suppose th be the object the class Thread whose thread is doing its execution 
                                    currently, then the th.join(); statement ensures that th is finished before 
                                    the program does the execution of the next statement. When there are more than 
                                    one thread invoking the join() method, then it leads to overloading on the 
                                    join() method that permits the developer or programmer to mention the waiting 
                                    period. However, similar to the sleep() method in Java, the join() method is 
                                    also dependent on the operating system for the timing, so we should not assume 
                                    that the join() method waits equal to the time we mention in the parameters. 
                                    The following are the three overloaded join() methods.


---------------->>>>>>>>>>>>> Description of The Overloaded join() Method:
                                -join(): When the join() method is invoked, the current thread stops its execution 
                                and the thread goes into the wait state. The current thread remains in the wait 
                                state until the thread on which the join() method is invoked has achieved its dead 
                                state. If interruption of the thread occurs, then it throws the InterruptedException.
                                    Syntax:  public final void join() throws InterruptedException  

                                -join(long mls): When the join() method is invoked, the current thread stops its 
                                execution and the thread goes into the wait state. The current thread remains in 
                                the wait state until the thread on which the join() method is invoked called is dead
                                or the wait for the specified time frame(in milliseconds) is over.
                                    Syntax: public final synchronized void join(long mls) throws InterruptedException

                                join(long mls, int nanos): When the join() method is invoked, the current thread 
                                stops its execution and go into the wait state. The current thread remains in the 
                                wait state until the thread on which the join() method is invoked called is dead or 
                                the wait for the specified time frame(in milliseconds + nanos) is over.
                                    Syntax: public final synchronized void join(long mls, int nanos) throws InterruptedException,


 */






// class Test implements Runnable{
//     public void run(){
//         for(int i = 1 ; i<=5 ; i++){    
//         try{
//             Thread.sleep(3000);
//             System.out.println(i);
                
//         }catch(Exception e){
//             System.out.println("Error!!");
//         }
//     }
// }
// }


// class Test2 implements Runnable{
//     public void run(){
        
//         for(int i = 5 ; i<=10 ; i++){
//         try{
//             Thread.sleep(3000);
//                 System.out.println(i);
//         }catch(Exception e){
//             System.out.print("Error!!");
//         }
//     }
// }
// }

// class Join{
//     public static void main(String[] args) {
//         Test t1 = new Test();
//         Test2 t2 = new Test2();

//         Thread th1 = new Thread(t1);
//         Thread th2 = new Thread(t2);

//         th1.start();
//         try{
//             System.out.println("Current Thread name is : " +Thread.currentThread().getName());
//             th1.join();
//         }catch(Exception e){
//             System.out.println("Error!!");
//         }
        
//         th2.start();
//         try{
//             System.out.println("Current Thread name is : " +Thread.currentThread().getName());
//             th1.join();
//         }catch(Exception e){
//             System.out.println("Error!!");
//         }
//     }
// }



// class Test extends Thread{
// Thread newThread;
//     public void run(){
//         newThread.interrupt();
//     }
// }

// public class Join{
//     public static void main(String[] args) {
        
//         try {
//             Test th1 = new Test();
//             th1.newThread = Thread.currentThread();
//             th1.start();
//             th1.join();
//         } catch (Exception e) {
//             System.out.println("The exception has been caught." +e);
//         }
//     }
// }






// class Test extends Thread{
//     public void run(){
//         for(int i =1 ; i<=5 ;i++){
//             try {
//                 System.out.println(i);
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }
// class Join{
//     public static void main(String[] args) {
        
//         Test t1 = new Test();
//         Test t2 = new Test();
//         Test t3 = new Test();

//         t1.start();
//         try{
//             t1.join();
//         }catch(Exception e){
//             System.out.println(e);
//         }

//         t2.start();
//         t3.start();
//     }
// }






class Test extends Thread{
    public void run(){
        for(int i =1 ; i<=5 ;i++){
            try {
                System.out.println(i);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Join{
    public static void main(String[] args) {
        
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        t1.start();
        try{
            t1.join(2000);
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}