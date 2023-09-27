import java.util.Scanner;
// public class Test 
// {
//     public static void main(String[] args) 
//     {
//         int x, y, z;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the first number:");
//         x = s.nextInt();
//         System.out.print("Enter the second number:");
//         y = s.nextInt();
//         System.out.print("Enter the third number:");
//         z = s.nextInt();
        
//         if(x>y)
//         {
//             if(x>z)
//             {
//                 System.out.println("x");
//             }
//             else if (x==z)
//             {
//                 System.out.println("x and z");
//             }
//             else
//             {
//                 System.out.println("z");
//             }
//         }
//         else if (x==y && y==z)
//         {
//             System.out.println("x and y and z");
//         }
//         else if (x==y)
//         {
//             System.out.println("x and y");
//         }
//         else if (y>z)
//         {
//             System.out.println("y");
//         }
//         else if (y==z)
//         {
//             System.out.println("y and z");
//         }
//         else
//         {
//             System.out.println("z");
//         }
        
        
        
//     }
// }



// import java.util.Scanner;
// import java.util.concurrent.FutureTask;

// abstract class Shape{
//     float calc;
//     abstract public void input();
//     abstract public void calc();
//     public void disp(){
//         System.out.println("Your area is : " +calc);
//     }

// }

// class Squre extends Shape{
//     float a;
//     public void input(){
//         System.out.println("Enter a Edge of Square : ");
//         Scanner scan = new Scanner(System.in);
//         a = scan.nextFloat();
//     }
//     public void calc(){
//         calc  = a * a;
//     }
// }

// class circle extends Shape{
//     float a;
//     public void input(){
//         System.out.println("Enter a Edge of Square : ");
//         Scanner scan = new Scanner(System.in);
//         a = scan.nextFloat();
//     }
//     public void calc(){
//         calc = (3.14f * a * a);
//     }
// }

// class Rectangle extends Shape{
//     float a;
//     float b;
//     public void input(){
//         System.out.println("Enter a Edge of Square : ");
//         Scanner scan = new Scanner(System.in);
//         a = scan.nextFloat();
//         b = scan.nextFloat();
//     }
//     public void calc(){
//         calc = a * b;
//     }
// }



// class main{
//     public void all(Shape sh){
//         sh.input();
//         sh.calc();
//         sh.disp();
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Squre sq = new Squre();
//         circle cr = new circle();
//         Rectangle rt = new Rectangle();


//         main m = new main();
//         m.all(sq);
//         m.all(cr);
//         m.all(rt);
    
//     }
// }

import java.util.*;

class Test{
    void Result(){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        
        while(i<n){
            if (n%i==0){
                i++;
            }
            else{
                System.out.println("non prime");
            }
        }
    }

    public static void main(String[] args) {
        Test();
    }

    private static void Test() {
    }
}