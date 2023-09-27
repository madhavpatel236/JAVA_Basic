
// PCP = producer consumer probleam.


// ---------->>>>>>>>>>>>>>> first part: in this output we have see this there are execute many prosucing value after that producing the consuming value

// class middle{
//     int x;
//     public void put(int a){
//         x=a;
//         System.out.println("Producer produce the value x " +x);
//     }
//     public void get(){
//         System.out.println("Consumer consume the value x "+x);
//     }
// }

// class producer extends Thread{
//     middle mi;     // here we create a referencial variable instand of creating a object. we can use directly referencial variable.
//     producer(middle f){ // in this line we can use injection of the methods.
//         mi = f;
//     }

//     public void run(){
//         int i = 1;
//         while(true){  // infinite loop
//         mi.put(i++);   // here we can use referancial variable directly.
//         }  
//     }
// }

// class consumer extends Thread{
//     middle mi;
//     consumer(middle g){
//         mi = g;
//     }
//     public void run(){
//         while(true){    //infinite loop
//             mi.get();
//         }
//     }
// }

// public class Basic {
//     public static void main(String[] args) {
//         middle m = new middle();

//         producer p = new producer(m);
//         consumer c = new consumer(m);
//         p.start();
//         c.start();
//     }
// }



// -------------->>>>>>>>>>>>>> Second part : in second part 



class middle{
    int x;
    boolean b = false;
    
    synchronized public void put(int a){
        try{
            if (b==true) { //in the else statement after the execution we can change the value of boolean into true and then we use notify(){this is use for notify the value,in short "the value is change"}
                wait(); // after the notify() JVm come to the if statement and in the if statement we have wait() statemet. so JVM can wait. in this time Thread can go to the  get method because thread can,t be wait for this statement.
            } else {
            x=a;
            System.out.println("Producer produce the value x " +x);
            b=true;
            notify();
            }
        } catch(Exception e){
            System.out.println("Some error!!");
        }
    }

    synchronized public void get(){
        try {
            if (b == false) { //  here we can write a false because now boolean b is a true. 
                wait(); // after this statement JVM go to the put method. again beacuse of JVM can't wait.
                
            } else {
                System.out.println("Consumer consume the value x "+x);
                b=false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Some error");
        }
        
    }
}


//below is same as first part


class producer extends Thread{

    middle mi;     
    producer(middle f){ 
        mi = f;
    }

    public void run(){
        int i = 1;
        while(true){
            mi.put(i++);   
        }  
    }
}
class consumer extends Thread{
    middle mi;
    consumer(middle g){
        mi = g;
    }
    public void run(){
        while(true){
            mi.get();
        }
    }
}
public class Basic {
    public static void main(String[] args) {
        middle m = new middle();

        producer p = new producer(m);
        consumer c = new consumer(m);
        p.start();
        c.start();
    }
}
