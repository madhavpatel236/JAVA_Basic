import java.lang.reflect.Method;
import java.util.Scanner;


// inheritance(extends) ni madad thi agad no akho class copy pest thay jay jethi kari ne apde bathi method lakhvi no pade
// interface(implements) ni madad thi apde badhi method bija class interface ma avi to jay pan badhi method pan declare karvi pade che.




// package interface and lambda exp.java;

/* ---------->>>>>>>>>> What is an interface?

- interface is a java feature, it allow only abstract methods.
- in java applications,for inheritance ,we are able to create only reference variables, we are unable to create objects.
- in the case of interfaces,by defult,all the variablees are "public static final"
- in the case of interface,by default, all the method are "public and abstract"
- in java application,constructor are possible in class and abstract class but not possible in the interface. 
- interface will provides more sharebility in java applications when compared with class and abstract class.

-------->>>>>>>>>>Why do we use an Interface?
- It is used to achieve total abstraction.
- Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
- Any class can extend only 1 class but can any class implement infinite number of interface.
- It is also used to achieve loose coupling.
- Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?

---->>>>>>>>>>> EX :
                    // A simple interface

                    interface Player
                    {
                        final int id = 10;
                        int move();
                    }

                     */









// interface  teacher{
//     public void name();
// }

// class Student implements teacher{
//     public void name(){
//         System.out.println("child class");
//     }
// }


// public class Basic {
//     public static void main(String[] args) {
//         Student st = new Student();
//         st.name();
//     }
// }






// interface Rectangle{
//     public void getarea(float leanth , float breath);
// }

// class calc implements Rectangle{

//     public void getarea(float leanth , float breath){
//         System.out.println("The leanth and Breath is :" +leanth+ " " +breath);
//     }
// }

// class Basic{
//     public static void main(String[] args) {
//         calc c = new calc();
//         c.getarea(2, 6);
//     }
// }












/* ---------->>>>>>>>>>>   Implementing Multiple Interfaces
In Java, a class can also implement multiple interfaces. For example,

            interface A {
              // members of A
            }
            interface B {
              // members of B
            }
            class C implements A, B {
              // abstract members of A
              // abstract members of B
            }


-------------->>>>>>>>>>>  Extending Multiple Interfaces
An interface can extend multiple interfaces. For example,

            interface A {
            }
            interface B {
            }
            interface C extends A, B {
            }


----------->>>>>>>>>>>>>> default methods in Java Interfaces:
With the release of Java 8, we can now add methods with implementation inside an interface. These methods are called default methods. To declare default methods inside interfaces, we use the default keyword. For example,

            public default void getSides() {
               // body of getSides()
            }
->>Why default methods?
- Let's take a scenario to understand why default methods are introduced in Java.
- Suppose, we need to add a new method in an interface.
- We can add the method in our interface easily without implementation. However, that's not the end of the story. All our classes that implement that interface must provide an implementation for the method.
- If a large number of classes were implementing this interface, we need to track all these classes and make changes to them. This is not only tedious but error-prone as well.
- To resolve this, Java introduced default methods. Default methods are inherited like ordinary methods



*/

// ----------->>>>>>>>>>>>>>>>>  default method

// interface Shape{
//   public default void disp(){
//     System.out.println("HEllO ");
//   } 
//   void input();
//   void calc();
//   void ans();
// }

// class Rectangle implements Shape{

//   int a;
//   int b;
//   int c;

//   public void input(){
//     a = 4;
//     b = 5;
//   }

//   public void calc(){
//     c = a*b;
//   }

//   public void ans(){
//     System.out.println(c);
//   }
// }



// class Circle implements Shape{

//   int a;
//   float c;

//   public void input(){
//     a = 2;
//   }

//   public void calc(){
//     c = 3.14f * a * a;
//   }

//   public void ans(){
//     System.out.println(c);
//   }
// }


// class Basic{
//   public static void main(String[] args) {
//     Rectangle Rc = new Rectangle();
//     Rc.disp();
//     Rc.input();
//     Rc.calc();
//     Rc.ans();

//     Circle c = new Circle();
//     c.disp();
//     c.input();
//     c.calc();
//     c.ans();

//     }
// }









/*----------->>>>>>>>>> private and static Methods in Interface
      -The Java 8 also added another feature to include static methods inside an interface.
      -Similar to a class, we can access static methods of an interface using its references. For example,

      // create an interface
      interface Polygon {
      staticMethod(){..}
      }
      // access static method
      Polygon.staticMethod();     */











/* ------------>>>>>>>>>>> Extending an Interface
Similar to classes, interfaces can extend other interfaces. The extends keyword is used for extending interfaces. For example,

            interface Line {
              // members of Line interface
            }
            // extending interface
            interface Polygon extends Line {
              // members of Polygon interface
              // members of Line interface
            }
*/


// interface one{
//   void method1();
//   void method2();
// }

// interface two extends one{  // extands karvathi ne agadni methods pan pest thay jay Aama and jo implement lakhiye to tene define karvi pade Aaya atle.
//   void method3();
// }

// class three implements two{
//   public void method1(){
//     System.out.println("method 1");
//   }
//   public void method2(){
//     System.out.println("method 2");
//   }
//   public void method3(){
//     System.out.println("method 3");
//   }

// }
// class Basic{
//   public static void main(String[] args) {
//     three t = new three();
//     t.method1();
//     t.method2();
//     t.method3();
//     }
// }









/*In Simple way,The interface contains multiple abstract methods, so write the implementation in implementation classes. If the implementation is unable to provide implementation of all  abstract methods, then declare the implementation class with abstract modifier, and complete the remaining method implementation in next created child classes. It is possible to declare multiple child classes but at final we have complete the implementation of all abstract methods.
-In general the development process is as steps by step:
  1. Level 1- interfaces : It contains the service details.
  2. Level 2 – abstract classes : It contains partial implementation.
  3. Level 3 – implementation classes : It contains all implementation.
  4. Level 4 – Final Code / Main Method : It have access of all interfaces data.

 */


// interface first{
//   void one();
//   void two();
//   void three();
//   void four();
//   void five();
// }

// abstract class second implements first{
//   public void one(){
//     System.out.println("one");
//   }
// }

// abstract class third extends second{
//   public void two(){
//     System.out.println("two");
//   }
// }

// class forth extends third{
//   public void three(){
//     System.out.println("three");
//   }
//   public void four(){
//     System.out.println("four");
//   } 
//   public void five(){
//     System.out.println("five");
//   }
// }

// class Basic{
//   public static void main(String[] args) {
//     forth f = new forth();
//     f.one();
//     f.two();
//     f.three();
//     f.four();
//     f.five();
//   }
// }







// ----------->>>>>>>>>>>>>>>  // Java program to demonstrate working of
                              // interface inside a class.


// import java.util.*;
// class Test
// {
// 	interface Yes
// 	{
// 		void show();
// 	}
// }

// class Testing implements Test.Yes
// {
// 	public void show()
// 	{
// 		System.out.println("show method of interface");
// 	}
// }

// class A
// {
// 	public static void main(String[] args)
// 	{
// 		Test.Yes obj;
// 		Testing t = new Testing();
// 		obj=t;
// 		obj.show();
// 	}
// }









