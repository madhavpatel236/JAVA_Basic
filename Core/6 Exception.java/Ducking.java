
// Keyword Throws :


// class Test{
//     void ch() throws Exception{  // Aya apde kay chiye ke je aa method ne je call kare tene Exception Hendal karvanu che , aaya handal nahi thay, in short aapne khali indication ape che ke call karva vada Exception handle karse.
//         int a = 6;
//         int b = 0;
//         int result = a / b;
//         System.out.println(result);
//     }
// }

// class Ducking{
//     public static void main(String[] args) throws Exception {
//         Test t = new Test();
//         try{
//             t.ch();
//         } catch(ArithmeticException obj){
//             System.out.println("ArithmeticException" +obj.getMessage());
//         } 
//     }
    
// }









// class Ducking{

    
//     public void ch() throws Exception{
//         int a = 6;
//         int b = 0;
//         int result = a / b;
//         System.out.println(result);
//     }

//     public void ch2() throws Exception{
//         ch();
//     }

//     public void ch3() throws Exception{
//         try{
//             ch2();
//         } catch(ArithmeticException obj){
//             System.out.println("Arithmetic Exception handeled by ch3" +obj.getMessage());
//         }
//         System.out.println("normal code inside the ch3()");
//     }
//     public static void main(String[] args) throws Exception {
//         Basic2 b = new Basic2();
//         b.ch3();
//         // try{
//         //      Basic2 b = new Basic2();
//         //      b.ch2();
//         // } catch(ArithmeticException obj){
//         //     System.out.println("ArithmeticException in main method" +obj.getMessage());
//         // } 
//         System.out.println("Normal code");
//     }
    
// }






// class Test  {
//     public void ch() throws ArithmeticException{
//         int a = 6;
//         int b = 0;
//         int result = a / b;
//         System.out.println(result);
//     }
// }

// class Ducking{
//     public static void main(String[] args) throws ArithmeticException {
//             Test t = new Test();
//             t.ch();
    
// }
// }










// // Throw Keyword :


// class Basic2{
//     void ch(){
//         int a = 6;
//         int b = 3;
//         int result;
        
//         if(b==3){ 
//             throw new ArithmeticException("You can't divide by 3"); // Aano matlab thay che ke jo b==3 thay atle throw thay jay Exception, jem ke b==0 thay tyare thay tem.
//         }
//         else{
//             System.out.println(result = a/b);
//         }
//     }
//     public static void main(String[] args) {
//         Basic2 b =new Basic2();
        
//         try {
//             b.ch();
//         } catch(ArithmeticException obj){ // throw karel valye aya avi ne obj ma save thay che.
//             System.out.println(obj); // Exception display karaviye cheiye je upar throw karel che.
//         } 
//     }
// }