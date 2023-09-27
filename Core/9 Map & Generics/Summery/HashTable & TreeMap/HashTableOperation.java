import java.util.*;

public class HashTableOperation {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"madhav");
        ht.put(2,"sagar");
        ht.put(3,"shubham");
        ht.put(4,"shubham");
        ht.put(5,"virat");
        // ht.put("madhav",null); wrong
        // ht.put(null,"madhav"); wrong
        System.out.println(ht);

    }
}
