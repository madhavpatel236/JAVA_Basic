/* Name of the constructor and name of the class must be the same.
        - Return type concept not applicable for constructor, even if we provide it won't result in compile time errors, if
            we do so then the Java launguage will treat this as "normal method".

            EX : class Test{
                Test(parameter){
                    //code
                }
            }


            


 */




class Update1{
    private int age;
    private int marks;
    private String name;

    Update1(String name , int age ){
        marks = 0;
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        
    }

    Update1(String name , int age , int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        
        
    }
}
class Constuctor{
    public static void main(String[] args) {
        
        Update1 a = new Update1("red" , 18);
        Update1 b = new Update1("blue" , 18 , 70);
    }
}