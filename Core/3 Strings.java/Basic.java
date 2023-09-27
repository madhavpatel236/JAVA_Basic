import java.util.Scanner;

import javax.management.MBeanAttributeInfo;

/*      In Java, string is basically an object that represents sequence of char value.

----->>>>>>>>     Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

------>>>>>>>     The java.lang.String class implements Serializable, Comparable and CharSequence interfaces

------>>>>>>>     The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. It means, we can create strings in Java by using these three classes.

------>>>>>>>       Different ways of Comparison : 
                    To compare 2 Strings in java we use following approach
                        a. == operator
                            It compares the refernce of the object.
                        b. equals()
                            it compares the contents of two objects.
                    
                    Example : 
                    String s1 = new String("sachin");
                    String s2 = new String("sachin");
                    System.out.println(s1==s2); //false
                    System.out.println(s1.equals(s2));//true
 */

/*  string a = "madhav"               // immutable String
    string a = new string("madhav");      // mutable String.
        In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool).
 */


// public class Basic{
//     public static void main(String[] args){
        
//     } {
//         String s1 = "madhav";           //  MADHAV che te string constant pool(scp) ma save thase atle tema have kooi changes no kari sakay.
//         String s2 = "karavadiya";
//         String s3 = new String("Patel");    // PATEl che te khali Heap ma save thase  atle have jo tema kai add karvu hoy to thase.
//         System.out.println(s1);
//         System.out.println(s2);
//     }
// }


// // aa program ma apde koi pan number ni ascii value ni madad thi String ni madad thi print karavyu.

// public class Basic{
//     public static void main(String[] args) {
//         byte ascii[] = {70,71,72};  // ASCII mate apde data type farajiyat pane BYTE j lakhvu pade. apde ahi 70,71,72 ni apde ASCII value thi ne string print karavi che.

//         String s1 = new String(ascii);  // Ahi apde ascii name na variable mathi badhi value lakhi s1 local variable ma. in short 70,71,72 lakhi s1 ma.
//         System.out.println(s1); // aya  apde 70 means 'F' , 71 means'G' , 72 means 'H' print karavya.
        
//         String s2 = new String(ascii,0,2);  // Ahi apde savthi pela0 je lakhel che teno atlab thay che ke 0 index number thi saru kari ne jya suthi leangth(atle ke be number,index number nahi khas kari ne) 2 na thay thya suthi na ascii ni madad thi String print karavana che.
//         System.out.println(s2);

//         String s3 = new String(ascii,0,1);
//         System.out.println(s3);
//     }
// }




