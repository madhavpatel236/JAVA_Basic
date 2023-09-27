
/* ----------->>>>>>>>>>>> lambda expression Workin on only Functional interface.
                            - if in lambda expression we have only one line to execute then we avoid{} brackates
                            - if in lambda expression we have more than one line or we have return statement then we must wrigt a {} brackets. 

------------>>>>>>>>> Functional Interface(which has only one method which must be abstract) is additionally recognized as Single Abstract Method Interfaces. In short, they are also known as SAM interfaces. Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming. 

------------>>>>>>>>>  Functional interfaces are included in Java SE 8 with Lambda expressions and Method references in order to make code more readable, clean, and straightforward. Functional interfaces are interfaces that ensure that they include precisely only one abstract method. Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface. As described earlier, functional interfaces can contain only one abstract method. However, they can include any quantity of default and static methods. 

------------>>>>>>>>>  In Functional interfaces, there is no need to use the abstract keyword as it is optional to use the abstract keyword because, by default, the method defined inside the interface is abstract only. We can also call Lambda expressions as the instance of functional interface.

----------->>>>>>>>>>  Before Java 8, we had to create anonymous inner class objects or implement these interfaces.


---------->>>>>>>>>>  A lambda expression can have zero or more parametes or arguments.
                        - usually we can specify the type of parameters. if the compilerexpects the type based on the context then we can remove type.
                        - if multiple parameters are present then these parameters should be saperated with comma(,).
                        - if there are zero number of parameter available then we have to use empty patameter[like()].
                        - if only one parameter is available and if the compiler can expect the type then we can remove the type and parameters also.
                        - similar to method body lambda expression body also can contain multiple statement s. if more than one  statements presents then we have to enclose inside within curly bracket.
                        - if one statement present then curly braces are optional.
                        - once we write a lambda expression we can call that expression just like a method,for this function interfaces are required.




//  */





// interface Student{ // functional interface
//     void name();
// }
// class lambda {
//     public static void main(String[] args) {
//         // Student obj = new Student();     ama right side nu delet kari devanu atle lambda bani jay.
//         Student s = () -> System.out.println("hello");
//         s.name();
//     }
// }    







// interface Student{ // functional interface
//     void name();
// }
// class lambda {
//     public static void main(String[] args) {
//         // Student s = new Student();     ama right side nu delet kari devanu atle lambda bani jay.
//         Student s = () -> { System.out.println("hello");
//                         System.out.println("Friends");
//                         };
//         s.name();
//     }
// }    







// interface one{
//     public void marks();
// }
// interface two{
//     public void age(int i);
// }

// class lambda{
//     public static void main(String[] args) {
//         one o = () -> { System.out.println("hello");
//         };
//         o.marks();

//         two t = (int i) -> System.out.println(i);
//         t.age(23);
//     }
// }






// interface Rectangle{
//     public void getarea(float leanth , float breath);
// }
// class lambda{
//     public static void main(String[] args) {
//         Rectangle r = (float lenth , float breath) -> {System.out.println(lenth);
//                                                     System.out.println(breath);};
//         r.getarea(23, 11);
//     }
// }
