/*  

-------->>>>>>>>>>>> What is an Exception :
                    (i) An unexapted or unwanted event that disturb the flow of code and distrub after written code.
                    (ii) Exception Hendling mens not a rebuilt the all code but adit some keyword for unexepted or unwanted event.

------------>>>>>>>>>>> there are two types of java exaptions:
                        (1) Buit in Exception
                        (2) user definr Exception

------------>>>>>>>>>>> Syntax: 
                        try{
                            /// code that whas distrub the code may be..
                        }
                        catch(TypeOfException)
                        {
                            // any comment..
                        }
                        finally{
                        }

------------>>>>>>>>>>> finnaly block:
- we cannot put the finally block into the try block because there are no 100% chance to execute the statement which is in the try block.
- we caanot put the finally block into the catch block because if catch block cant't be executed then finnay block also not executed.
- so we put the finally block outside of the try and catch block.  
- finally block always executed if Exception can occure or not.                   
 */






// class Basic{
//     public static void main(String[] args) {
        
//         int a = 6;
//         int b = 0;
//         try{
//             int Divison = a / b ;   // this is a unexepted or unwanted condition so we put in the try . joo Aa line ma j Exceptiion avi jase ne to nichni sout vadi line nahi execute thay.
//             System.out.println(Divison);
//         }
//         catch(Exception obj){  // Exception 1k prakar no default class che jema badh Exaption avi jay che.
//                                 // Aa line no matlab e thay che ke je Exceptiion avyu che te obj ma save thay jay che.
//             System.out.println("plase Enter a valid number...");
//         }
//     }
// }




// class Basic{
//     public static void main(String[] args) {
        
//         int a = 6;
// int b = 0;
//         try{
//             int Divison = a / b ;   
//             System.out.println(Divison);
//         }
//         catch(Exception obj){  
//             System.out.println("plase Enter a valid number...");
//         }
//         finally{
//             System.out.println("In any Situation any thing in final keyword then always executed the Statement");
//         }
//     }
// }

















/*

------------>>>>>>>>>>>>>>> (1) Built-in Exception:

Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations. Below is the list of important built-in exceptions in Java. 

- ArithmeticException: It is thrown when an exceptional condition has occurred in an arithmetic operation.

- ArrayIndexOutOfBoundsException: It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.

- ClassNotFoundException: This Exception is raised when we try to access a class whose definition is not found

- FileNotFoundException: This Exception is raised when a file is not accessible or does not open.

- IOException: It is thrown when an input-output operation failed or interrupted

- InterruptedException: It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.

- NoSuchFieldException: It is thrown when a class does not contain the field (or variable) specified

- NoSuchMethodException: It is thrown when accessing a method that is not found.

- NullPointerException: This exception is raised when referring to the members of a null object. Null represents nothing

- NumberFormatException: This exception is raised when a method could not convert a string into a numeric format.

- RuntimeException: This represents an exception that occurs during runtime.

- StringIndexOutOfBoundsException: It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string

- IllegalArgumentException : This exception will throw the error or error statement when the method receives an argument which is not accurately fit to the given relation or condition. It comes under the unchecked exception. 

- IllegalStateException : This exception will throw an error or error message when the method is not accessed for the particular operation in the application. It comes under the unchecked exception.

 */




// // ARITHMETIC EXCEPTION :

// public class Basic {
//     public static void main(String[] args) {
//         int a = 6;
//         int b = 0;
        
//         try{
//             int Divison = a / b ;
//             System.out.println(Divison);
//         }
//         catch(ArithmeticException obj ){
//             System.out.println("Arithmetic Exaption" +obj );
//         }
//     }
// }





// // ArrayIndexOutOfBoundsException :

// class Basic{
//     public static void main(String[] args) {
        
//         int []Arr = {1,2,3,4,5};
        
//         try {
//             // Arr[8] = 75;
//             System.out.println(Arr[8]);
//         } catch (ArrayIndexOutOfBoundsException obj) {
//             System.out.println("invallid input.." +obj );
//         }
//         finally{
//             System.out.println("ArrryIndexOutOfBoundsException");
//         }
        
//     }
// }



// // NullPointerException :

// class Basic{
//     public static void main(String[] args) {
        
//         String name = null ;

//         try {
//             System.out.println(name.charAt(0));
//         } catch (NullPointerException obj) {
//             System.out.println("NullPointerException" + obj);
//         }
//     }
// }




// //  StringIndexOutOfBound Exception :

// class Basic{
//     public static void main(String[] args) {
        
//         String name = "Madhav";

//         try{
//             char a = name.charAt(7);
//         }catch(StringIndexOutOfBoundsException obj){
//             System.out.println("StringIndexOutOfBoundsException" +obj.getMessage() );
//         }
//     }
// }













/* 

------->>>>>>>>>>>>>>>> User-Defined Exceptions :
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, the user can also create exceptions which are called ‘user-defined Exceptions’

------->>>>>>>>>>>>>>>> The following steps are followed for the creation of a user-defined Exception. 

    - The user should create an exception class as a subclass of the Exception class. Since all the exceptions are subclasses of the Exception class, the user should also make his class a subclass of it. This is done as: 
        - Sytanx: class MyException extends Exception : We can write a default constructor in his own exception class. 
    - Constuctor of Exception : MyException(){}

    - We can also create a parameterized constructor with a string as a parameter. 
    - We can use this to store exception details. We can call the superclass(Exception) constructor from this and send the string there. 
        MyException(String str)
        {
            super(str);
        }

------->>>>>>>>>>>>>>>> To raise an exception of a user-defined type, we need to create an object to his exception class and throw it using the throw clause, as: 
                Syntax :    MyException me = new MyException(“Exception details”);
                            throw me;

 */




