// class Update{
//     public static void main(String[] args) {
//         String s1 = "madhav";  // immutable String ne lithe apde kai aa String ma change no thay.
//         s1.concat("patel"); // aya apde concat ni madad thi change kari sakay nahi karan ke aa inmuttable String che atle kai change no thay.

//         System.out.println(s1);

//     }
// }



/*  StringBuffer is a class in Java that represents a mutable sequence of characters. It provides an alternative to the immutable String class, allowing you to modify the contents of a string without creating a new object every time.

------>>>>>>  Here are some important features and methods of the StringBuffer class:
(1)StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
(2)The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method.
(3)The append() method is used to add characters, strings, or other objects to the end of the buffer.
(4)The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer.
(5)The delete() method is used to remove characters from the buffer.
(6)The reverse() method is used to reverse the order of the characters in the buffer.

-------->>>>>>>> Important Constructors of StringBuffer class:
StringBuffer(): creates an empty string buffer with the initial capacity of 16.
StringBuffer(String str): creates a string buffer with the specified string.
StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.


*/




// public class Update{
//     public static void main(String[] args) {
//         StringBuffer  s1 = new StringBuffer();  // String s1 banavi(Define kari).
//         s1.append("Madhav");        // with the use of appand() method we create new instance(variable).
//         s1.append(" ");
//         s1.append("Karavadiya");
//         System.out.println(s1);
        
//         // Transfer one string value to the other. 
//         // String s2 = s1.toString(); // s1.toString no matlab thay che ke s1 name n alocal variable mathi save karel value s2 name na variable ma add or transfer kari dayo.
//         // System.out.println(s2);
//     }
// }




// class Update{
//     public static void main(String[] args) {
//         StringBuffer s1 = new StringBuffer("Madhav") ;
//         s1.append(" Patel ");  // now original string is changed
//         System.out.println(s1);
//     }
// }





// class Update{
//     public static void main(String[] args) {
//         StringBuffer s1 = new StringBuffer("Madhav");
//         s1.append(" Atulbhai");
//         s1.append(" Karavadiya");
//         System.out.println(s1);
//     }
// }





// class Update{
//     public static void main(String[] args) {
//         StringBuilder s1 = new StringBuilder("Saffrony");
//         s1.append(" Institude");
//         s1.append(" of");
//         s1.append(" Technology");
//         System.out.println(s1);
//     }
// }

