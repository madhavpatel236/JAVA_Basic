/*

------------>>>>>>>>>> Daemon Thread in Java
                            -Daemon thread in Java is a service provider thread that provides services to the user thread. Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
                            -There are many java daemon threads running automatically e.g. gc, finalizer etc.
                            -You can see all the detail by typing the jconsole in the command prompt. The jconsole tool provides information about the loaded classes, memory usage, running threads etc.
                            --Points to remember for Daemon Thread in Java
                                    It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
                                    Its life depends on user threads.
                                    It is a low priority thread.
                                    Why JVM terminates the daemon thread if there is no user thread?
                                    The sole purpose of the daemon thread is that it provides services to user thread for background supporting task. If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread if there is no user thread.


 */



public class Daemon extends Thread{  
    public void run(){  
    if(Thread.currentThread().isDaemon()){//checking for daemon thread  
    System.out.println("daemon thread work");  
    }  
    else{  
    System.out.println("user thread work");  
    }  
    }  
    public static void main(String[] args){  
    Daemon t1=new Daemon();//creating thread  
    Daemon t2=new Daemon();  
    Daemon t3=new Daemon();  
    
    t1.setDaemon(true);//now t1 is daemon thread  
    
    t1.start();//starting threads  
    t2.start();  
    t3.start();  
    }  
}  