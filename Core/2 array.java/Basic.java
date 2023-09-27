
/* syntex : var_name = new type [size]; 

Example: 
int A[];    //declaring array
A = new int[20];  // allocating memory to array

The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).

------->>>>>>>  Array Literal : 
In a situation where the size of the array and variables of the array are already known, array literals can be used. 

Example:
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
// Declaring array literal
The length of this array determines the length of the created array.
There is no need to write the new int[] part in the latest versions of Java.

------->>>>>>> Accessing Java Array Elements using for Loop :
Each element in the array is accessed via its index. The index begins with 0 and ends at (total array size)-1. All the elements of array can be accessed using Java for Loop.

Example:
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
System.out.println("Element at index "  +i+  " : "  +arr[i]);


*/ 





// // Java program to illustrate creating an array of integers,  puts some values in the array, and prints each value to standard output.

class array{
    public static void main(String[] args) {
        // int arr[];    // declares an Array of integers.
        // arr = new int[5];  // allocating memory for 5 integers.
        // arr[0] = 10;   // initialize the first elements of the array.
        // arr[1] = 11;   // initialize the second elements of the array.
        // arr[2] = 12;
        // arr[3] = 13;
        // arr[4] = 14;

        int arr[] = {10,11,12,13,14};  // this is the second metho to fill the array element and this is the best method for long array.
        String  name[] = {"madhav","parth","virat","kohli"};

        for( int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter at index " + i + " : " + arr[i]);
        } System.out.println(); // name 1line muki ne print thay atle.
        for ( int i = 0 ; i < name.length ; i ++ ){
            System.out.println(name[i]);
        }
    }
}





/*******************************           2D Array       ***************************/



// class TwoD{
//     public static void main(String[] args) {
        
//         int arr[][] = { {1,2,3},
//                         {4,5,6},
//                         {7,8,9}
// };
//         // int arr[][] = { {1,2,3},{4,5,6},{7,8,9}}; // Aa rite pan 2D array ne lakhi sakay.

//     for ( int i = 0 ; i < arr.length ; i++){       // Aya apde i atle row lay ne chaliye to  1li row no 1st element 1 che atle te have niche ni Jvadi FOR loop ma jase. 
//         for ( int j = 0 ; j < arr.length ; j++){  // Aya apde j atle column lay ne chali ye to peli columnn no pelo element 1 che atle have te loop statement execute karse.
//             System.out.print(arr[i][j] + " " );  // Aa no matlab thay che ke arr[1][1]. ane pachi pluse kari ne space mukvathi answer ma element vache space mukay.
//         }                                       // arr[1][1] pachi have pointe khali j vadi loop ne j execute karva jase j = 3 suthi, jayare j=4 thase tyare te for loop execute nahi thay ane te I vadi LOOP execute karse means i=0 hatu atyar suthi have loop execute thay ne i=1 thase,have biji row na element mate same process thase.
//         System.out.println();                  // Aa line tayre execute thase ke jayare J vadi LOOP execute thava nu bandh thase and pointr I vadi LOOP ni condition check karva jase, jethi biji row na element biji row ma lakhay.
//                                               // upar ni chelethi 3rd comment mujab aa loop i = 3 and j = 3 suthi execute thase.
//     }
//     }
// }





// class jaggedD{
//     public static void main(String[] args) {
        
//         int arr[][] = { {1,2,3,4},
//                         {5,6},
//                         {7,8,9,10}
// };

//         for ( int i = 0 ; i <= 3 ; i++ ){
//             for ( int j = 0 ; j < arr[i].length ; j++ ){  // aya pade j < arr[i].length lithel che eno matlab em thay che ke jayare 1li row ni FOR loop chaltu hase thayare i=0 ma ketla element che te batavse pachi i=2 mate biji row ma ketla element che te print karse.in short arr[0].length means 0 mi row ni leangth getli j ni vlaue.
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



/******************************     For-each loop (Enhanced for looop)      ********************************************/

/*                                  for (type variable_name : array_name) 
                                    { 
                                        // statements using variable_name like,
                                        system.out.println(variable_name);
                                    }                                                                                  */




// class each{
//     public static void main(String[] args) {
        
//         int arr[]={1,2,3,4,5};

//         for (int element : arr) {   // Aano matlab e thay che ke INT ELEMENT namno apde je sadi rite variable banaviye chiye te j che ane teni andar ARR nni madad thi one by ine kari ne element save thata jay che , Aa case ma pela ARR mathi 1 avse te store thase ELEMENT ma pachi print thase pachi ARR mathi 2 avse te ELEMENT ma save thase pachi te print thase ........
//             System.out.println(element);  // only use variable_name.
//         }

//     }
// }






// class each2{
//     public static void main(String[] args) {
//         int arr[][] = { {1,2,3},
//                         {4,5,6,7},
//                         {8,9,10},
//                         {11,12,13,14,15,16}
//         };

//         for(int eachrow[] : arr ){     // ahi apde 1D array ni jem value save nahi kari sakiye EACHROW karan ke aya i=1 laye to pan 3 value save karvi pade 1sathe je possible nathi ththi, Aaya pela apde row atle ke i=0 ni badhi value {1,2,3} EACCHROW ma save kari. in short i=1 means {1,2,3,} save kayru pela EACHROW[] ma.
//             for(int M : eachrow ){    // have apde uapar to aakhe akhi row save thay {1,2,3} atle have ahi EACHROW ne array lai litho and N name na variable ma one by one valu save kari. in short pela 1 store thase pachi print thase and pachi fati thi FOR loop follo thase atle have 2 stro thaaas eand pachi 3 store thase.
//                 System.out.print( M+ " ");
//             } 
//             System.out.println();
//         }
//     }
// }








