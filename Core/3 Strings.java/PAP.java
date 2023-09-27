import java.util.Arrays;
import java.util.Scanner;

// PPA = palindrom , Pangram , Anagram 

// Palindrom = like "MADAM" atle ke sithe thi and undhe thi name lakhata name same j lakhay

// public class PAP {
//     public static void main(String[] args) {
//         String a = "MADAM";
//         String b = "";

//         for(int i = a.length()-1 ; i>=0 ; i-- ){
//             b = b + a.charAt(i);
//         }  

//         if (a.equals(b)) {
//             System.out.println("The given String is palindrom");
//         } else {
//             System.out.println("The given String is not palindrom");
//         }
//     }    
// }

// // Pangram = Aa method ma A to Z badha word avi jay 1 sentance ma tene pangram kevay.

// public class PAP
// {
//     public static void main(String[] args) 
//     {
//     boolean flag=false;

//         String str="THE QUICK ROWN FOX JUMPS OVER LAZY DOG";
//         str=str.replace(" ", "");         // space remove kari.
//         char []ch=str.toCharArray();        // convert char to Array.

//         int ar[]=new int[26];           // Creat a new arr and give a size 26.

//         for(int i=0;i<ch.length;i++)            // creat a loop for AR[] array
//         {
//             ar[ch[i]-65]++;                // Capital word che atle -65 kayru, jethi array ma line ma gothvay jay, ABCD wise.
//         }
//         for(int i=0;i<ar.length;i++)      // crate a loop for chakeing it's pangram or not
//         {
//             if(ar[i]==0)                  // ano matlab thay che ke jyate i==0 atle ke array ma koi pan element o means ke empty thase tyare Koi ne koi word nahi hoy array ma atle ke pangram nahi hoy.
//             {
//                 System.out.println("Its not pangram");
//                 flag=true;  // ano matlab thay che ke jo if ni condition right thay to atle ke aa pangram no hoy to flage ni value true ma fervi nakhvi.
//             }
//         }
//         if(flag==false) // ano matlab thay che ke jo flage ni value false j rye to aa pangram che. ano bijo matlab thay che ke jo flag ni value true no thay hoy to te upar na if statment ne j follow na kare means ke te pangram hoy j.
//         {
//             System.out.println("Its pangram");
//         }
//     }
// }

// Anagram = like PEEK and EKEP means First String ma getla word use thaya hoy tetla world use thay Second String ma , Apda aa example ma !st String ma P,E,E,K words no use thayo che and 2nd ma pan aaj word no use thyao che atle aa pangram che.

// class PPA{
//     public static void main(String[] args) {

//         String s1 = "PEEK";
//         String s2 = "EKEP";

//         char arr1[] = s1.toCharArray(); // .tocharArray ni madad thi Srting thi ne Array bani jay mean aa exampke ma apde PEEK ne String mathi arry ma badli nakhyo.
//         char arr2[] = s2.toCharArray();

//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         if (Arrays.equals(arr1, arr2)) {
//             System.out.println("The given String is Pangram");
//         } 
//         else {
//             System.out.println("The given String is not Pangram");
//         }

//     }
// }

// // reverce

class PAP {
    public static void main(String[] args) {

        String arr = "madhav";
        String arr2 = "";
        System.out.println(arr);

        for (int i = arr.length() - 1; i >= 0; i--) {
            arr2 = arr2 + arr.charAt(i);
        }
        System.out.println(arr2);
    }
}