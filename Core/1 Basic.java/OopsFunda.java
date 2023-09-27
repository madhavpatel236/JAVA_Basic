// //  In this example, we have created a Student class which has two data members id and name. We are creating the object of the Student class by new keyword and printing the object's value.
// // Here, we are creating a main() method inside the class.




// class student{   // defining a student class.
//     int id;    // define instance variable.
//     string name;   // define instance variable.

//     public static void main(String[] args) {    //creating main method inside the Student class .
//         student s1 = new student();    //Creating an object or instance. here student is a class name and s1 is a variable. s1 is also called as a refrencial variable.

//         // Printing values of the object. 

//         System.out.println(s1.id);     // accessing instance(object) variable.
//         System.out.println(s1.name);
//         }
// }


// // EXAMPLE : 2

// class worker{
//     int age;
//     string name;

//     public static void main(String[] args) {
//         worker no = new worker();

//         System.out.println(no.age);
//         System.out.println(no.name);
//     }
// }






// // Java Program to demonstrate having the main method in.


// // create  a student class.
// class student{
// int id;
// string name;
// }

//     // another class TestStudent1 which contains the main method.

// class TestStudent1{
//         public static void main(String[] args) {
//             student S1 = new student();  // here we have use a student class because we gate the value from the student class.

//                 System.out.println(S1.id);
//                 System.out.println(S1.name);

//         }
// } 




/*      3 Ways to initialize object (Initializing an object means storing data into the object)
                                There are 3 ways to initialize object in Java.

                                                (i)  By reference variable
                                                (ii) By method
                                                (iii) By constructor                                                       */


/**********************************************    (i)  By reference variable   ****************************************/

// Initializing an object means storing data into the object. Let's see a simple example where we are going to initialize the object through a reference variable.


// class student{
//         int id;
//         String name;
// }
// class student2{
//         public static void main(String[] args) {
        
//         student s1 = new student();   // object
//         s1.id = 39;   // refrential variable.
//         s1.name = "madhav";   // refrential variable.

//         System.out.println(s1.id+ " "+s1.name);  //printing members with a white space.
//         }
// }



// EXAMPLE : 2


class student{
        int id;
        String name;
}

class Teststudent{
        public static void main(String[] args) {
        
        //Creating objects.
        student s1 = new student();
        student s2 = new student();

        //Initializing objects.
        s1.id = 39;
        s1.name = "madhav";
        s2.id = 11;
        s2.name = "parth";

        System.out.println(s1.id+ " " + s1.name);
        System.out.println(s2.id+ " " +s2.name);
        }
}




/**********************************          (ii) Initialization through method          *******************************/


// In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method. Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.










/*****************************************          (iii) By constructor         ***************************************/





















/******************************          METHOD OVERLODING IN JAVA.             *******************/ 


/* If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the 
method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you
as well as other programmers to understand the behavior of the method because its name differs.

So, we perform method overloading to figure out the program quickly. 

-----There are two ways to overload the method in java

        (I)  By changing number of arguments [ a(int,int)  and  a(int,int,int) ]
        (II) By changing the data type [ static int add(int a , int b)  and  static double add(double a , double b) ]


/*********************************            (I)  By changing number of arguments              ************************/


// // In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

// class adder{
//     static int add(int a , int b){   // aya void ni jagya e apde INT lakhel che karan ke apde body mathi values RETURN karie chiye pachi. ADD to khali variable name ni jem khali name j che teni jagya e apde kaipan lakhi sakiye.
//         return a + b ;
//     }
//     static int add(int a , int b , int c){
//         return a + b + c ;
//     }
// }

// class overloding1{
//     public static void main(String[] args) {

//         System.out.println(adder.add(11,12));
//         System.out.println(adder.add(11,12,13));

//     }
// }



// /********************************       (II) changing data type of arguments (Automatic promotion in overloading)    *************************/

// The following are various possible automatic promotions in overloading.

//  byte ->> short / char ->> int ->> long ->> float ->> double

// // In this example, we have created two methods that differs in data type. The first add method receives two integer arguments and second add method receives two double arguments.


// class adder1{
//     static int add(int a , int b){
//         return a + b;
//     }
//     static double add(double a , double b){
//         return a + b ;
//     }
// }

// class overloding2{
//     public static void main(String[] args) {
        
//         System.out.println(adder1.add(11,12));
//         System.out.println(adder1.add(11.1,11.2));
//     }
// }