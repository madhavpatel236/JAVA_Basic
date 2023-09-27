/*  ENCAPSULATION means - to the outside world,the data should not be exposed directly.

Binding of data and correspnding methods into a single unit is called "Encapsulation"
Encapsulation = Data Hiding + abstraction.
*/


/* ------->>>>>>>  Shadowing Problem and this keyword : 
If both local variable and instance variable have the same name inside the method then it would
resut in a name-clash and jvm will always give preference for local variable.
*/



// class student{

//     private int Age;
//     private String name;

//     public void student(int Age){   //method
//         Age = Age;  // Aaya AGE = AGE ma JVM age ne defolt tarike local variable tarike lye che 
//     }

//     public void student(String name){
//         name = name;
//     }

//     public void display(){
//         System.out.println("Age is : " +Age);
//         System.out.println("Name is : "+name);
//     }
// }

// public class Encapsulation{
//     public static void main(String[] args) {
//         student d = new student();
//         d.display();
//     }
// }







// --------->>>>>>>>>>>  Program to demonstrate the usage of setters and getters.



// class student{

//     private String name;
//     private int id; 

//     public void setName(String name){
//         this.name = name;  // this. no matlab thay che ke te Instance variable ne store kare che means je object tene main method mathi call karse te pramane te value save karse.
//     }
//     public String getName(){
//         return name;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }
//     public int getId() {
//         return id;
//     }

// }

// public class Encapsulation{
//     public static void main(String[] args) {
        
//         student d = new student();
//         d.setName("madhav");
//         d.setId(39);

//         student d1 = new student();
//         d1.setName("parth");
//         d1.setId(11);

//         System.out.print("name is : "+ d.getName() + " ,");
//         System.out.println("Id is : "+ d.getId());
//         System.out.print("name is : "+ d1.getName() + " ,");
//         System.out.println("Id is : "+ d1.getId());
        

//     }
// }




