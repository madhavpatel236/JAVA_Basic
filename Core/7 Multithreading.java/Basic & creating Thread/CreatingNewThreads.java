import java.util.*;



//  // (1) with the help of the extend:

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Child Thread");
//     }
// }

// class CreatingNewThreads{
//     public static void main(String[] args) {
//         MyThread mt = new MyThread(); 
//         mt.start();
//     }
// }






// class myThraed1 extends Thread{
//     public void run(){
//         System.out.println("In myThread1");
//     }
// }

// class myThread2 extends Thread{
//     public void run(){
//         System.out.println("In myThread2 ");
//     }
// }


// class CreatingNewThreads{
//     public static void main(String[] args) {
        
//         myThraed1 one = new myThraed1();
//         one.start();
//         myThread2 two = new myThread2();
//         two.start();
//     }
// }









// // (2) with the help of the implement

// class Main1 implements Runnable{
//     public void run(){
//         System.out.println("In Main1");
//     }
// }

// class Main2 implements Runnable{
//     public void run(){
//         System.out.println("In Main2");
//     }
// }

// class CreatingNewThreads{
//     public static void main(String[] args) {
        
//         Main1 m1 = new Main1();
//         Main2 m2 = new Main2();

//         Thread t1 = new Thread(m1);
//         t1.start();
//         Thread t2 = new Thread(m2);
//         t2.start();
//     }
// }





// class Main1 implements Runnable{
//     public void run(){
//         try {
//             int marks = 456;
//             int totalSub = 6 ;
//             float persant = (marks)/totalSub;
//             System.out.println(persant);
//         } catch (Exception e) {
//             System.out.println("Some Error!!!" +e.getMessage());
//         }
//     }
// }


// class CreatingNewThreads{
//     public static void main(String[] args) {
//         Main1 m1= new Main1();

//         Thread t1 = new Thread(m1);
//         t1.start();
//     }
// } 














// // (3) Creating Parameterized Thread directly


// class CreatingNewThreads implements Runnable{

//         public void run(){
                    
//         }
    
//     public static void main(String[] args) {
        
//         // CreatingNewThreads t1 = new CreatingNewThreads();
//         Runnable t1 = new CreatingNewThreads(); // creating the object of the class. Beacause thread creat karva mate pela class no object banavo farjiyat che.
//         Runnable t2 = new CreatingNewThreads();

//         Thread th1 = new Thread(t1,"Madhav"); // () ma je t1 laykho che teno matlab thay che ke t1 object mate no Thraed
//         th1.start();

//         Thread th2 = new Thread(t2,"Patel"); // () ma je t2 laykho che teno matlab thay che ke t1 object mate no Thraed
//         th2.start();

//     System.out.println(th1.getName());
//     System.out.println(th2.getName());
//     }
    
// }



// class Main implements Runnable{
//     public void run(){
//     }
// }

// class CreatingNewThreads{
//     public static void main(String[] args) {
        
//         Main m = new Main();
//         Main m1 = new Main();

//         Thread t1 = new Thread(m,"madhav");
//         t1.start();
//         System.out.println(t1.getName());
//         System.out.println(t1.getPriority());

//         Thread t2 = new Thread(m1,"Patel");
//         t2.start();
//         System.out.println(t2.getName());
//         System.out.println(t2.getPriority());
//     }
// }















// class Main1 implements Runnable{
//     public void run(){
//         try {
            
//             Scanner scan = new Scanner(System.in);
//             System.out.println("Entear your total marks");
//             int marks =scan.nextInt();
            
//             System.out.println("Enter Total number of Subject");
//             int totalSub = scan.nextInt();
            

//             float persant = marks/totalSub;
//             System.out.println(persant);
//         } catch (Exception e) {
//             System.out.println("Some Error!!!" +e.getMessage());
//         }
//     }
// }


// class CreatingNewThreads{
//     public static void main(String[] args) {
//         Main1 m1= new Main1();

//         Thread t1 = new Thread(m1);
//         t1.start();
//     }
// } 















// // Direct main method ma j Thread creat kari ne impliment kari naykho che.

// class CreatingNewThreads{
//     public static void main(String[] args) {
        
//         Thread t1 = new Thread(){
//             public void run(){
//                 try {
                    
//                     Scanner scan = new Scanner(System.in);
//                     System.out.println("Entear your total marks");
//                     int marks =scan.nextInt();
                    
//                     System.out.println("Enter Total number of Subject");
//                     int totalSub = scan.nextInt();
                    
        
//                     float persant = marks/totalSub;
//                     System.out.println(persant);
//                 } catch (Exception e) {
//                     System.out.println("Some Error!!!" +e.getMessage());
//                 }
//             }
//         };
//         t1.start();
//     }
// }
















// class CreatingNewThreads{
//     public static void main(String[] args) {
        
        
//         //System.out.println(Thread.currentThread());
//         Thread t = Thread.currentThread();
//         System.out.println(t.getName());
//         System.out.println(t.getPriority());
        
//         t.setName("Madhav");
//         System.out.println("New Thread Name : " + t.getName());
        
//         t.setPriority(7);
//         System.out.println("New Priority : " +t.getPriority());

//         System.out.println();
//         System.out.println();

//         Thread t1 = new Thread(){
//             public void run(){
//                 try {
                    
//                     Scanner scan = new Scanner(System.in);
//                     System.out.println("Entear your total marks");
//                     int marks =scan.nextInt();
                    
//                     System.out.println("Enter Total number of Subject");
//                     int totalSub = scan.nextInt();
                    
        
//                     float persant = marks/totalSub;
//                     System.out.println(persant);
//                 } catch (Exception e) {
//                     System.out.println("Some Error!!!" +e.getMessage());
//                 }
//             }
//         };
//         t1.start();
//     }
// }

















// class childThread extends Thread{
//     public void run(){
//         for(int i = 1 ; i<=5 ; i++ ){
//             System.out.println("Child thread");
//         }
//     }
// }



// public class CreatingNewThreads extends Thread{
//     public static void main(String[] args) {
        
//         Thread t = Thread.currentThread();
//         System.out.println("current Thread is : " +t.getName());

//         t.setName("Madhav");
//         System.out.println("After changing  a Thread name : " +t.getName());

//         System.out.println(" Main thred priority is : "+t.getPriority());
//         t.setPriority(MAX_PRIORITY);
//         // t.setPriority(7);
//         System.out.println("After changing a priority : " +t.getPriority());

//         for(int i = 1 ; i<=5 ; i++ ){
//             System.out.println("Main thread");
//         }
//         // calling the child Thread
//         childThread ct = new childThread();
// /*
// other way to crate a new chlild Thread directly

// Thread ct = new Thread(){
// public void run(){
//     // code
// }
// };
// ct.start();
//  */
//         System.out.println("Child thread Priority : " +ct.getPriority());
//         ct.setPriority(MIN_PRIORITY);
//         System.out.println("Child THread new Priority : "+ct.getPriority());
        
//         ct.start();
//     }
// }


