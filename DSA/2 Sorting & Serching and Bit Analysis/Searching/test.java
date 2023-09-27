// // Modification of Binary Search
// // Time Complexity: O(log n)
// // Space Complexity: O(1)

// import java.io.*;
// import java.util.*;

// class test {

//     // function definition
//     public static int findFirstOccurence(int[] arr, int target){
//         int low=0, high=arr.length-1;
//         int result = -1;

//         while(low <= high){
//             int mid = low + (high - low)/2;
//             if(arr[mid] == target){
//                 result = mid;
//                 high = mid - 1;
//             }

//             else if(arr[mid] > target){
//                 high = mid - 1;
//             }

//             else{
//                 low = mid + 1;
//             }
//         }
//         return result;
//     }


//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in an array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the array elements: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target element:");
//         int target = sc.nextInt();

//         // function calling
//         int l = findFirstOccurence(arr, target);
//         if(l == -1){
//             System.out.println("Target element is not present in an array");
//         }
//         else{
//             System.out.println("Target element first occurence is present at index: "+l);
//         }
// }
// }


// import java.io.*;
// import java.util.*;
// class Library{
    

//     Scanner sc = new Scanner(System.in);
    
//     void addBook(){
//         String[] Book = new String[5];
//         System.out.println("Which Book you want to insert: ");
//         for(int i=0;i<Book.length;i++){
//             Book[i] = sc.nextLine();
//         }
//         System.out.println("Books are:");
//         for(int i=0;i<Book.length;i++){
//             System.out.print(Book[i]+" ");
//         }
//     }
    
//     void issueBook(){
//         System.out.println("How many book you want to issue: ");
//         int x = sc.nextInt();
//         String[] issueBook = new String[x];
//         System.out.println("Write name of Book you want to issue: ");
//         for(int i=0;i<issueBook.length;i++){
//             issueBook[i]=sc.nextLine();
//         }
//         System.out.println("Your issue Book is:");
//         for(int i=0;i<issueBook.length;i++){
//             System.out.print(issueBook[i]+" ");
//         }
//         }
    
    
//     void returnBook(){
//         System.out.println("How many Book you want return: ");
//         int y = sc.nextInt();
//         String[] returnBook = new String[y];
//         System.out.println("Write name of Book you want to return: ");
//         for(int i=0;i<returnBook.length;i++){
//             returnBook[i]=sc.nextLine();
//         }
//         System.out.println("Your return Book is:");
//         for(int i=0;i<returnBook.length;i++){
//             System.out.print(returnBook[i]+" ");
//         }
//     }
    
//     void showAwailableBook(){
//         String[] showAwailableBook = new String[5];
//         System.out.println("The available Books in the library are: ");
//         for(int i=0;i<Book.length;i++){
//             // ABook[i] = Book[i] - issueBook[i]; 
//         }
//         for(int i=0;i<ABook.length;i++){
//             System.out.println(ABook[i]+" ");
//         }
//     }
// }


// class test {
// 	public static void main (String[] args) {
// 	Library l  = new Library();
// 		l.addBook();
// 		l.issueBook();
// 		l.returnBook();
// 		// l.showAwailableBook();
// 	}
// }