import java.util.Scanner;

import javax.swing.InputMap;

/*********************************************************   FOR    ****************************************************
                                for (initialExpression; testExpression; updateExpression)
                                            {    // body of the loop  }                                                */





// //  Display n Natural Numbers using for loop.


// public class Loop {
//     public static void main(String[] args) {
//         int i;
//         for(i = 0 ; i<= 10 ; i++){
//             System.out.println(i);
//         }

//     }
// }




// // Display Sum of n Natural Numbers.

// public class Loop{
//     public static void main(String[] args) {
//         int sum = 0;
//         // int i;

//         for(int i = 0 ; i <=5 ; i++){
//             sum += i;
//         }
//         System.out.println(" sum is : " +sum);
//     }
// }



/****************************************************    WHILE   *******************************************************
                                                while (testExpression) 
                                                  { // body of loop }                                                 */






// //  Display Numbers from 1 to 5 with while looop.

// public class Loop {
//     public static void main(String[] args) {
//         int i = 1 ;

//         while(i <=5 ){
//             System.out.println(i);
//             i++;
//         }
//     }
// }





// // Sum of Positive Numbers Only at the poin when user can enter a negetive value ,using while loop.

// Java program to find the sum of positive numbers


// import java.util.Scanner;  // // khali scanner name ni file je java ma padi che tya suthi pochvama mada kare che , atle khali location jevu kam kare  che.

// class Main {
//   public static void main(String[] args) {
      
//     int sum = 0;

//     // create an object of Scanner class
//     Scanner input = new Scanner(System.in);

//     // take integer input from the user
//     System.out.println("Enter a number");
//     int number = input.nextInt();

//     // while loop continues 
//     // until entered number is positive
//     while (number >= 0) {
//       // add only positive numbers
//       sum += number;

//       System.out.println("Enter a number");
//       number = input.nextInt();
//     }

//     System.out.println("Sum = " + sum);
//     input.close();
//   }
// }



/**************************************************** DO WHILE   *******************************************************
                                                do{
                                                (Expression)
                                               }while(condition)                                                     */




// // Display Numbers from 1 to 5 using do while loop.


// public class Loop{
//   public static void main(String[] args) {
//     int i = 1;
//     do{
//       System.out.println(i);
//       i++;
//      }while(i <= 5);
//   }
// }






//  Sum of Positive Numbers Only at the poin when user can enter a negetive value ,using while loop.


// import java.util.Scanner;

// public class Loop{
  
//   public static void main(String[] args) {
    
//     Scanner scan = new Scanner(System.in);
//     int sum = 0;
//     System.out.println("Enter a number : ");
//     int number = scan.nextInt();
    
//     do {
//       sum += number;        // Aaya apde sum += number; ayaj lakhvu pade karan ke pela sum thay jay negetive velyu mukay te pela, pachi number input thay che atle negetive value sum ma no thay.
//       System.out.println("Enter a number : ");
//       number = scan.nextInt();
//       // sum += number;       // Aaya apde aa vastu na muki sakiye karan kejo aya aa eqestion mukiye to jo kadach user negetive value add kare to te pan sum ma add thsy jay je apde karvanu nath.  
//     } while (number >= 1);

//     System.out.println("The sum is : " +sum);

//   }
// }






