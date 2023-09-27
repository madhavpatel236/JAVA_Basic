// import java.util.*;

// package inheritance and polymorphism.java;

// class Squre{
//     void input(){
//         System.out.println("Enter a Edge of Square : ");
//         Scanner scan = new Scanner(System.in);
//         float a = scan.nextFloat();
//         Float cal = a * a ;
//         System.out.println(cal);
//     }
// }

// class circle{
//     void input(){
//         System.out.println("Enter a Redius of circle : ");
//         Scanner scan = new Scanner(System.in);
//         float a = scan.nextFloat();
//         Float cal = (float) (3.14 * a * a) ;
//         System.out.println(cal);
//     }
// }

// class Rectengle{
//     void input(){
//         System.out.println("Enter a teo sides of Rectangle : ");
//         Scanner scan = new Scanner(System.in);
//         float a = scan.nextFloat();
//         float b = scan.nextFloat();
//         Float cal = a * b ;
//         System.out.println(cal);
//     }
// }


// public class app {
//     public static void main(String[] args) {
//         Squre A = new Squre();
//         A.input();

//         circle B = new circle();
//         B.input();

//         Rectengle C = new Rectengle();
//         C.input();
//     }
// }






/*-----------------------------------------------------------------------------------------------*/

import java.util.Scanner;
import java.util.concurrent.FutureTask;

abstract class Shape{
    float calc;
    abstract public void input();
    abstract public void calc();
    public void disp(){
        System.out.println("Your area is : " +calc);
    }

}

class Squre extends Shape{
    float a;
    public void input(){
        System.out.println("Enter a Edge of Square : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
    }
    public void calc(){
        calc  = a * a;
    }
}

class circle extends Shape{
    float a;
    public void input(){
        System.out.println("Enter a Edge of Square : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
    }
    public void calc(){
        calc = (3.14f * a * a);
    }
}

class Rectangle extends Shape{
    float a;
    float b;
    public void input(){
        System.out.println("Enter a Edge of Square : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        b = scan.nextFloat();
    }
    public void calc(){
        calc = a * b;
    }
}



class main{
    public void all(Shape sh){
        sh.input();
        sh.calc();
        sh.disp();
    }
}
class app{
    public static void main(String[] args) {
        Squre sq = new Squre();
        circle cr = new circle();
        Rectangle rt = new Rectangle();


        main m = new main();
        m.all(sq);
        m.all(cr);
        m.all(rt);
    
    }
}