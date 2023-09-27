/* Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

------>>>>> Inheritance known as a parent-child relationship.

------>>>>> Why use inheritance in java
            For Method Overriding (so runtime polymorphism can be achieved).
            For Code Reusability.

------>>>>> Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
            Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
            Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
            Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.                

------>>>>> The syntax of Java Inheritance
            class Subclass-name extends Superclass-name  
            {  
                   //methods and fields  
            }  

------>>>>>  Types of inheritance in java:
                (i) Single level
                (ii) multi level
                (iii) Hierarchical
                (iv) multiple
                (v) Hybrid


------>>>>> Types of method in inheritance:
            (i) inherited : The method which would come from parent to child due to inheritance is called inherited method.
            (ii) overridden : The method which is taken from Parent and changes the implementation as per the needs of the requirement
                                in the class is called the “overridden method”.
            (iii) specialized : The methods which are specific to the particular class are called “Specialised method”.


*/





// class Parents{
//     int a = 39;

//     void base(){   // parent class , base class ,Extand class 
//         System.out.println("Parent class is executed now!!" +a);
//     }
// }
// class child extends Parents{   // child class , Derived class
//                                 // here Parent class in available to execute now.
// }

// class Basic{
//     public static void main(String[] args) {

//         Parents b = new child();  // Here we call only CHILD class but code is executed which is in the PARENT class 
//         b.base(); // here we call BASE method which is present in PARENT class but we creat a object of CHILD class but because of extend keyword we accese PARENTS class into the CHILD class.

//     }
// }







// class Parent{
//     void Base(){
//         int age = 19;
//         System.out.println("code will be executed which is in the parent class ");
//         System.out.println(age);
//     }
// }

// class Child1 extends Parent{
//     void derived(){
//         System.out.println("code will be executed which is in the parent class");

//     }
// }

// class Child2 extends Child1{
//     void derived2(){
//         System.out.println("code will be executed which is in the Child1 class");

//     }
// }

// class Child3 extends Child2{
//     void derived3(){
//         System.out.println("code will be executed which is in the Child2 class");

//     }

// }


// class Basic{
//     public static void main(String[] args) {
//         Child3  b = new Child3 ();  // here we create a object of clss CHILD3 
//         b.derived2();  // but with help the of the inheritance we can use a method DERIVED2 which is present in diff class
//         b.Base();    // here we  with help the of the inheritance we can use a method BASE which is present in diff class
//     }
// }





// ---------->>>>>>>>>>>>>>>>>>>        Method Overriding in Java Inheritance.             <<<<<<<<<<<<<<<<<---------------


// class Animal{
//    void eat(){
//       System.out.println("eat");
//    }
// }
// class dog extends Animal{
//    void eat(){                 // Overriding of eat() method because we can change the class eat() which is present in the parent class.
//       System.out.println("Overriding of eat() method in dog class");
//    }
//    void sleep(){               // specialized method becuse we add new method in child class which is not present in the parent claas.
//       System.out.println("sleep");
//    }
// }

// class lion{
//    void eat(){      // Overriding of eat() method
//          System.out.println("Overriding of eat() method in lion class");
//       }
// }

// public class Basic{
//    public static void main(String[] args) {
    
//       dog a = new dog();
//       a.eat();
//       a. sleep();

//       lion b = new lion();
//       b.eat();
    
//    }
// }





// --------->>>>>>>>>>>>>>>>>>>>>         super(),this()  Keyword in Java Inheritance in constuctor        <<<<<<<<<<<<<<<<------------------


// class Student{
//    int age = 19;
//    String name = "madhav";

//    Student(){
//       System.out.println(age);
//       System.out.println(name);
//    }
//    Student(int age){
//       String name = "parth";
//       System.out.println(age);
//       System.out.println(name);
//    }
// }

// class teacher extends Student{
//    int id = 1;
//    String name = "Hyader Abbas";

//    teacher(){
//       super(); // super means koi pan class ma parameter vina nu constuctur che to pela te execute thase pchi Aaya avese and execute karse.  
//       System.out.println(id);
//       System.out.println(name);
//    }
//    teacher(int id){
//       super(24);
//       String name = "Navin";
//       System.out.println(id);
//       System.out.println(name);
//    }
// }

// class Basic{
//    public static void main(String[] args) {
    
//       teacher a = new teacher();
//       teacher b = new teacher(2);
    
//    }
// }






// class Student{
//    int age = 19;
//    String name = "madhav";

//    Student(){
//       System.out.println(age);
//       System.out.println(name);
//    }
//    Student(int age){
//       String name = "parth";
//       System.out.println(age);
//       System.out.println(name);
//    }
// }

// class teacher extends Student{
//    int id = 1;
//    String name = "Hyader Abbas";

//    teacher(){
//       this(2); // this() no matlab thay che ke te tena te class ma te perameter varo constuctor gotse ane tene pela execute karse pachi aya avse execute katva.
//                   // pan aa case ma teacher class che te inheritance karel che atle 1st STUDENT() che te execute thase pachi 2nd ma TEACHER(INT ID) execute thase pachi las ma aa constuctor execute thase. in case jo aa program inheritancee no na hot to pela TEACHER(INT ID) vadu execute that pachi aa constuctoe execute thay.
//       System.out.println(id);
//       System.out.println(name);
//    }
//    teacher(int id){
    
//       String name = "Navin";
//       System.out.println(id);
//       System.out.println(name);
//    }
// }

// class Basic{
//    public static void main(String[] args) {
    
//       teacher a = new teacher();
    
//    }
// }



/*------------------------------------------------------------------------------------------------------------------- */


// abstract class Collage{
//        public void name(){
//               System.out.println("Collage name is S.P.B patel Engg collage");
//        }
// }

// class Student extends Collage{
//        public void sName(){
//               String name;
//               System.out.println("The student name is :" );
//        }
// }

// class Student1 extends Collage{
//        public void sName(){
//               System.out.println("The student1 name is :" );
//        }
//        }

// class Student2 extends Collage{
//        String name;
//        public void sName(){
//               System.out.println("The student2 name is :" );
//        }
// }



// public class Basic{
//        public static void main(String[] args) {
//               Student sn = new Student();
//               sn.name();
//               sn.sName();
//               Student1 sn1 = new Student1();
//               sn1.name();
//               sn1.sName();
//               Student2 sn2 = new Student2();
//               sn2.name();
//               sn2.sName();
              
// }
// }



class teacher{
       int id = 1;
       String name = "jigo";
       teacher(int id){
              System.out.println(id);
              System.out.println(name);
       }
       teacher(int id , String name){
              System.out.println(id);
              System.out.println(name);
       }
}

class Student extends teacher{
       int no = 39;
       String lacture ="Oops";
       Student(){
              this(20);
              System.out.println(no);
              System.out.println(lacture);
       }
       Student(int no){
              super(2, "Parth");
              System.out.println(no);
              System.out.println(lacture);
       }
       Student(int no , String name){
              this();
              System.out.println(no);
              System.out.println(name);
       }
}


class Basic{
       public static void main(String[] args) {
              Student s = new Student();
              Student s1 = new Student(12, "jeet");
       }
}


