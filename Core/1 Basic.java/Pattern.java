import javax.lang.model.util.ElementScanner14;

// public class Pattern {
// public static void main(String[] args) {

// int i = 0;

// for (i = 0; i <= 5; i++) {
// System.out.println('*');
// }

// }
// }

// public class Pattern {
// public static void main(String[] args) {
// int i = 0;
// int j = 0;

// for (i = 0; i < 5; i++) // rows
// {
// for (j = 0; j < 5; j++) // columan
// {
// System.out.print('*');
// }
// System.out.println('*');

// }
// }
// }

// public class Pattern {
// public static void main(String[] args) {

// // int n = 5;
// for (int i = 0; i < 5; i++) {
// for (int j = 0; j < 5; j++) {

// if (i == 0 || j == 0 || i == 4 || j == 4) {
// System.out.print("*");
// } else {
// System.out.println(" ");
// }
// }
// System.out.println();
// }

// }

// }

// public class Pattern {
// public static void main(String[] args) {
// int n = 10;

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// if (i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
// System.out.print("*");
// } else {
// System.out.print(" "); // print ni madad thi tej line ma print thay che.
// }
// }
// System.out.println(); // println() cursur ne niche ni line ma layave che.

// }
// }
// }

// public class Pattern
// {
// public static void main(String[] args)
// {
// int n = 9;

// for(int i = 0 ; i < n ; i++)
// {
// for(int j = 0 ; j < n ; j++)
// {
// if( i == j || i + j == n-1 || i == (n-1)/2)
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// public class Pattern
// {
// public static void main(String[] args)
// {
// System.out.println(" ");
// int n = 7 ;

// for(int i = 0 ; i < n ; i++)
// {
// for(int j = 0 ; j < n ; j++)
// {
// if( i == 0 || j == (n-1)/2 || i == (n-1) && j < (n-1)/2 || j == 0 && i >
// (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.print(" "); // tene te line ma lakhava mate tej FOR ni I loop ma J
// ni navi FOR loop umeri devani. means I loop atle ke rows to tej continue
// karvani che khali column ma change karvano che.

// for(int j = 0 ; j < n ; j++)
// {
// if( j == 0 || i == 0 || j == (n-1) || i == (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.print(" "); // same upar ni jem khali column atle ke J ni FOR loop
// navi umeri pelani I FOR loop ma j.

// for(int j = 0 ; j < n ; j++)
// {
// if( j == 0 || i == 0 && j < (n-1) || i == (n-1) && j < (n-1) || j == (n-1) &&
// i !=0 && i !=(n-1) )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.print(" "); // same upar......

// for(int j = 0 ; j < n ; j++)
// {
// if( i == 0 || i == (n-1) || j == (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.print(" "); // same......
// for(int j = 0 ; j < n ; j++)
// {
// if( j == (n-1)/2 && i >= (n-1)/2 || i + j ==(n-1) && i < (n-1)/2 || i == j &&
// i < (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.print(" "); //same...

// for(int j = 0 ; j < n ; j++)
// {
// if( j == 0 || i == 0 || j == (n-1) || i == (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }

// System.out.println();
// }
// }
// }

// public class Pattern
// {
// public static void main(String[] args)
// {
// int n = 7;

// for(int i = 0 ; i < n ; i ++)
// {
// for(int j = 0 ; j < n ; j++ )
// {
// if( j == 0 || j == (n-1) || i == (n-1)/2 && j == (n-1)/2 || i + j == (n-1) &&
// i < (n-1)/2 || i - j == 0 && i < (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");

// }
// }
// System.out.println();
// }

// }
// }

// public class Pattern{
// public static void main(String[] args) {
// int n = 5;
// for(int i =0 ; i < n ; i ++ ){

// for( int j = 0 ; j < n ; j++){

// if( i == 0 || j == 0 || j == (n-1) || i == (n-1)/2 )
// {
// System.out.print("*");
// }
// else
// {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// class Pattern{
// public static void main(String[] args) {

// for( int i=0 ; i<7 ; i++){
// for(int j = 0 ; j<4 ; j++){
// if (i==3 || i== 2 && j== 3/2 || i==2 && j == 5/2 || i==2 && j ==7/2 || i==4
// && j==3/2 || i==4 && j == 5/2 || i==4 && j ==7/2 || i ==1 && j ==5/2 || i ==1
// && j ==7/2 ||i==5 && j== 5/2 || i==5 && j==7/2 || i==0 && j == 7/2 || i==6 &&
// j == 7/2) {
// System.out.print(" * ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// }
// }

// class Pattern {
// public static void main(String[] args) {

// for (int i = 0; i < 7; i++) {
// for (int j = 0; j < 4; j++) {
// if (i == 3 || i == 2 && j == 3 / 2 || i == 2 && j == 5 / 2 || i == 2 && j ==
// 7 / 2
// || i == 4 && j == 3 / 2 || i == 4 && j == 5 / 2 || i == 4 && j == 7 / 2 || i
// == 1 && j == 5 / 2
// || i == 1 && j == 7 / 2 || i == 5 && j == 5 / 2 || i == 5 && j == 7 / 2 || i
// == 0 && j == 7 / 2
// || i == 6 && j == 7 / 2) {
// System.out.print(" * ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// }
// }
