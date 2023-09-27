import java.util.*;

// // (1) : 

// class Demo {
//     int no;
//     String name;

//     public void test(int no, String name) {
//         this.no = no;
//         this.name = name;
//     }

// }

// public class AccecingObject {
//     public static void main(String[] args) {

//         Demo d = new Demo();
//         d.test(1, "madhav");

//         Demo d2 = new Demo();
//         d2.test(2, "parth");

//         HashMap hm = new HashMap();
//         hm.put(10, d);
//         hm.put(20, d2);
//         System.out.println(hm);
//     }
// }

// // in the above code we get a map address not a value 
// // in the sout we directly call the tostring() method so we can override the tostring() and in this we return the no and name.

// // (2): 

class Demo {
    int no;
    String name;

    public void test(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String toString() {
        return no + " " + name;
    }
}

public class AccecingObject {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.test(1, "madhav");

        Demo d2 = new Demo();
        d2.test(2, "parth");

        HashMap hm = new HashMap();
        hm.put(10, d);
        hm.put(20, d2);

        // System.out.println(hm);
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me);
        }
    }
}
