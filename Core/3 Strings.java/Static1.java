import java.util.Scanner;

/* Where is the "static" keyword applicable?
The Static keyword is a non-accecc :modifier in Java and iC applicable for the following:
1. Variables
2. Methods
3. Blocks
4. Class

---->>>>>> Static Variables :  
If we declare any variable as Static, then it is called a Static variable. When a variable is declared as Static, then
a Single copy of that variable iS created and Shared among all of the objects at the class level. Static variables
are global variables. All instances of the class Share the Came Static variable.
We can create Static variableS at the class level only.

------>>>>>> Static Method :
A Static method is a method that belongs to a class rather than an instance of a class. This means you can call
a Static method 8ithout creating an object of the class. Static methods are Cometimes called class methods.

- You can access static methods from Outside of the class in which they are definedg This is not possible with
non-static methods


----->>>>>> Static Blocks :
It is used to initialize static data members. It is used to initialize before the main method at the time of class
loadingg It gets executed only once when the class gets loadedg It is not necessary to execute it again when
creating different Objects after the first time.


----------------->>>>>>>>>>>>>>>>>> How Java Program Actually executes:

------------ In JVM how Program do work : Class Loading.

- In Java, classloading is the process of loading class files into the JVM (Java Virtual Machine) at runtimeg It is
responsible for loading classes from various sources, such as the file system, network, and databases, and
making them available to the JVM for execution.

- The class loading process in Java is divided into three phases: LOADING, LINKING, and INITIALIZATION.

1. Loading: In the loading phase, the classloader locates the class file using the fully qualified class name,
reads the class file, and converts it into a Class objectg The Class object contains the metadata of the class,
such as the fields, methods, and constructors.

2. Linking: In the linking phase, the JVM performs several operations on the Class object, such as verifying the
class file's integrity, resolving symbolic references, and allocating memory for the class variables.

3. Initialization: In the initialization phase, the JVM initializes the class variables with their default values, and
runs the class's static initialization block (if any).


(i) Static Variable
(ii) static blocks
(iii) main method
(iv) non Static(instance) variable
(v) non Static method

 */




// class Student{
//     int age ;   
//     static String school;  

//     // static {          
//     //     school = "PW";
//     // }
//     public void show(){   
//         System.out.println("in show " + age + " " + school);
//     }
//     public static void study(){  
//         System.out.println("In Static method ");   
//     }
// }

// public class Static1{

//     public static void main(String[] args) {
        
//         System.out.println("in main method");

        
//         Student.study();
        
//         Student obj = new Student();
//         obj.age = 19;
//         obj.school = "PWSkills";
//         obj.show();

//         Student obj1 = new Student();
//         System.out.println(obj1.school);
//         obj1.show();    
//     }    
// }






class student{

    int age;        // instance variable
    static int no;   // static variable

    static{
        no = 39;  // declare a static variable value
        System.out.println("IN static block,The no is " +no);
    }

    void show(){   //non static method
        System.out.println(age+ " " +no); 
    }

    static void show2(){ // static method.
        System.out.println("In static method show2()");
    }
}

class Static1{
    public static void main(String[] args) {
        
        System.out.println("In Main Method");

        student.show2(); // Aya apde object creat karvani jarur nathi karan ke SHOW2() che te static metho che jeme object banayva vina output lay sakay.

        student obj = new student(); // aya obj banavyo karan ke SHOW() che te non-static method jene call karva mate refernce variable(in short object) ni jarur pade.
        obj.age=19;
        obj.show();

        student obj1 = new student();
        obj.age =20;
        obj.show();
    }
}