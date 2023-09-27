// import java.security.AllPermission;

// import javax.swing.text.BadLocationException;



/* -------------->>>>>>>>>>>>>>>>>>>>>          Polymorphism (one into many)           <<<<<<<<<<<<<<<----------------------   */


/*  here are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.

------->>>>>>>>>>>  polymorphism ma mainly to apde parents class na variable ma chaild class ne claa kari sakiye object banavti vakhate, for EX : Aeroplane a = new Cargoplane(); 



 */


// class AeroPlane{
//     public void tackoff(){
//         System.out.println("AeroPlane tackoff now!!");
//     } 
//     public void fly(){
//         System.out.println("Aeroplan is flying");
//     }
// }

// class CargoPlane extends AeroPlane{
//     public void tackoff(){
//         System.out.println("CargoPlane tackoff now!!");
//     } 
//     public void fly(){
//         System.out.println("Cargoplane is flying");
//     }
// }


// class PassangerPlane extends AeroPlane { 
//     public void tackoff(){
//         System.out.println("PassangerPlane tackoff now!!");
//     } 
//     public void fly(){
//         System.out.println("Passnagerplane is flying");
//     }
// }


// class Basic{
//     public static void main(String[] args) {
//         CargoPlane cp = new CargoPlane();
//         PassangerPlane pp = new PassangerPlane();

//         AeroPlane ref;
//         //ref = new CargoPlane();  or
//         ref = cp; // here we can replace the local variable of Cargoplane into a ref variable which is represents perent class variable , so we can directly use by using the parent class variable.

//         ref.tackoff(); // here we can use ref variable insted of the cp variable
//         ref.fly();

//         System.out.println("-------------------------------------------------------------------------------------------------------");

//         ref = pp;

//         ref.tackoff();
//         ref.fly();
        
//     }
// }












// class AeroPlane{
//     public void tackoff(){
//         System.out.println("AeroPlane tackoff now!!");
//     } 
//     public void fly(){
//         System.out.println("Aeroplan is flying");
//     }
// }

// class CargoPlane extends AeroPlane{
//     public void tackoff(){
//         System.out.println("CargoPlane tackoff now!!");
//     } 
//     public void fly(){
//         System.out.println("Cargoplane is flying");
//     }
// }


// class PassangerPlane extends AeroPlane { 
//     public void tackoff(){
//         System.out.println("PassangerPlane tackoff now!!");
//     } 
//     public void fly(){
//         System.out.println("Passnagerplane is flying");
//     }
// }

// class Airport{
//    public void all(AeroPlane ref){
//         ref.tackoff();
//         ref.fly();
//         System.out.println("----------------------------------------------------------");
//     }
// }
// class polymorphism{
//     public static void main(String[] args) {
        
//         CargoPlane cp = new CargoPlane();
//         PassangerPlane pp = new PassangerPlane();

//         // AeroPlane ref;

//         // ref = cp; 

//         // ref.tackoff(); 
//         // ref.fly();

//         // System.out.println("-------------------------------------------------------------------------------------------------------");

//         // ref = pp;

//         // ref.tackoff();
//         // ref.fly();
        
//         Airport a = new Airport();
//         a.all(cp);
//         a.all(pp);
//     }
// }







// class student{
//     int id = 39;
//     String name = "Madhav";
    
//     public void id(){
//         System.out.println(id);
//     }
//     public void name(){
//         System.out.println(name);
//     }
// }

// class Student1 extends student{
//     int id = 11;
//     String name = "parth";
//     public void id(){
//         System.out.println(id);
//     }
//     public void name(){
//         System.out.println(name);
//     }
//     // public void srmane(){
//     //     System.out.println("hello");
//     // }
// }

// class Student2 extends student{
//     int id = 18;
//     String name = "meet";
//     public void id(){
//         System.out.println(id);
//     }
//     public void name(){
//         System.out.println(name);
//     }
// }


// class teacher{  // here we create a new class for use polymorphisum to reduse code size and make code efficiance.
//     public void all(student ref){ // aya apde je class ni methods ne call kariye te exicuth tahy jay che atle apde dar vakhat badhi class mate obj banavi ne call no karvo pade, 1 var ma j call thay jay.
//         ref.id();
//         ref.name();
//         // ref.srmane();

//         System.out.println("-------------------------------------------------");
//     }
// }

// class polymorphism{
//     public static void main(String[] args) {
        
//         Student1 a = new Student1();
//         Student2 b = new Student2();
//         teacher c = new teacher();
//         c.all(a); // ano matlab thay che ke all name ni method je teache ma che tema A means ke student1 ni badhi property ref ma save thay jay.
//         c.all(b);
//     }
// }






/* ------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>             Abstract          <<<<<<<<<<<<<<<<<<<<<<<<<<<------------------ */

// if in any class and method can not have any body(code) then this method is called abstract method.
// if any one(At least one) this type of method present in the class then we can say that this is abstract method. 
// we can define a abstact method    >>>   abstact <data_type> <method_name>();
// we cannot be define the abstact as a variable.



// abstract class student{
//     int id = 39;
//     String name = "Madhav";
    
//     abstract void id(); // this is abstarct method. 

//     public void name(){
//         System.out.println("This method is a  executeble method.");
//     }
// }

// class Student1 extends student{
//     int id = 11;
//     String name = "parth";
//     public void id(){
//         System.out.println(id);
//     }
//     public void name(){
//         System.out.println(name);
//     }
// }

// class Student2 extends student{
//     int id = 18;
//     String name = "meet";
//     public void id(){
//         System.out.println(id);
//     }
//     public void name(){
//         System.out.println(name);
//     }
// }

// class teacher{  // here we create a new class for use polymorphisum to reduse code size and make code efficiance.
//     public void all(student ref){ // aya apde je class ni methods ne call kariye te exicuth tahy jay che atle apde dar vakhat badhi class mate obj banavi ne call no karvo pade, 1 var ma j call thay jay.
//         ref.id();
//         ref.name();

//         System.out.println("-------------------------------------------------");
//     }
// }

// class polymorphism{
//     public static void main(String[] args) {
        
//         Student1 a = new Student1();
//         Student2 b = new Student2();
//         teacher c = new teacher();
//         c.all(a); // ano matlab thay che ke all name ni method je teache ma che tema A means ke student1 ni badhi property ref ma save thay jay.
//         c.all(b);
//     }
// }