

/*

-------------->>>>>>>>>>>>>> Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.

-------------->>>>>>>>>>>>>> Threads can be created by using two mechanisms : 
                                (i)Extending the Thread class 
                                (ii)Implementing the Runnable Interface


-------------->>>>>>>>>>>>>> Advantages of Java Multithreading:
                                1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
                                2) You can perform many operations together, so it saves time.
                                3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

-------------->>>>>>>>>>>>>> Multitasking:
                                - Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:
                                    (1)Process-based Multitasking (Multiprocessing)
                                    (2)Thread-based Multitasking (Multithreading)
                                1) Process-based Multitasking (Multiprocessing)
                                    Each process has an address in memory. In other words, each process allocates a separate memory area.
                                    A process is heavyweight.
                                    Cost of communication between the process is high.
                                    Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
                                2) Thread-based Multitasking (Multithreading)
                                    Threads share the same address space.
                                    A thread is lightweight.
                                    Cost of communication between the thread is low.

-------------->>>>>>>>>>>>>>  What is Thread in java:
                                - A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
                                - Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.

-------------->>>>>>>>>>>>>> Java Thread class:
                                - Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and perform operations on a thread. Thread class extends Object class and implements Runnable interface.

-------------->>>>>>>>>>>>>> Thread Scadular : 
                                - If multiple threads are waiting to execute,then Which thread will execute !st is decided by threadScadular which is part of JVM.
                                - In the case of multithreading We can't predict the exect output,only possible output we can expect.




 */




// -------------->>>>>>>>>>>>>> Extending the Thread class.

// class Test extends Thread{  // Thread class extand karvathi apde je inbuilt mrthod hoy Thread ma tene copy pest kariye chiye aa class ma. 
//     public void run(){ // aya method nu name run hovu jaruri j che teni andar j badhi process karvani.
//         System.out.println("Hello");
//     }
// }

// class Theory{
//     public static void main(String[] args) {
//         Test obj = new Test();
//         obj.start(); // start method j call karvani karan ke start method ni anadarj run method ave che.
//     }
// }



// class Test extends Thread{
//     public void run(){
//         try {
//             int a = 12;
//             int b = 0;
//             int res;
//             System.out.println(res = a/b);
//         } catch (ArithmeticException e) {
//             System.out.println("Error!!");
//         }
//     }
// }

// class Theory1{
//     public static void main(String[] args) {
//         Test obj = new Test();
//             obj.start();
        
//     }
// }





// -------------->>>>>>>>>>>>>> interface.


// class Test implements Runnable{
//     public void run(){
//         System.out.println("Hello");
//     }
// }


// class Theory1{
//     public static void main(String[] args) {
//         System.out.println("Hello!");
//         Test t = new Test();
//         Thread t1 = new Thread(t);
//         t1.start();
//     }
// }


// --------->>>>>>>>>>> Start a Thread twice.

public class Theory extends Thread{  
    public void run(){  
    System.out.println("running...");  
    }  
    public static void main(String args[]){  
    Theory t1=new Theory();  
    t1.start();  
    t1.start();  // throw a Exception
    }  
}  





/*  

---------->>>>>>>>>>> A thread in Java at any point of time exists in any one of the following states. A thread lies only in one of the shown states at any instant: 
                        (i) New
                        (ii) Runnable
                        (iii) Blocked / waiting
                        (iv) Timed Waiting
                        (v) Terminated.    https://media.geeksforgeeks.org/wp-content/uploads/threadLifeCycle.jpg

------------>>>>>>>>>>>>>>>> Explanation of Different Thread States
                                (i)New Thread: When a new thread is created, it is in the new state. The thread has not yet started to run when the thread is in this state. When a thread lies in the new state, its code is yet to be run and hasn’t started to execute.
                                (ii)Runnable State: A thread that is ready to run is moved to a runnable state. In this state, a thread might actually be running or it might be ready to run at any instant of time. It is the responsibility of the thread scheduler to give the thread, time to run. 
                                    A multi-threaded program allocates a fixed amount of time to each individual thread. Each and every thread runs for a short while and then pauses and relinquishes the CPU to another thread so that other threads can get a chance to run. When this happens, all such threads that are ready to run, waiting for the CPU and the currently running thread lie in a runnable state.
                                (iii)Blocked/Waiting state: When a thread is temporarily inactive, then it’s in one of the following states: 
                                    Blocked
                                    Waiting
                                (iv)Timed Waiting: A thread lies in a timed waiting state when it calls a method with a time-out parameter. A thread lies in this state until the timeout is completed or until a notification is received. For example, when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.
                                (v)Terminated State: A thread terminates because of either of the following reasons: 
                                    Because it exits normally. This happens when the code of the thread has been entirely executed by the program.
                                    Because there occurred some unusual erroneous event, like segmentation fault or an unhandled exception.




 */