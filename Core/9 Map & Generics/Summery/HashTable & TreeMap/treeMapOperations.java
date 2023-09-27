import java.util.TreeMap;

public class treeMapOperations {
    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap();
        tm.put(13,"madhav");
        tm.put(2, "parth");
        tm.put(30, "siddharth");
        tm.put(4, "siddharth");
        tm.put(52, "siddharth");
        // tm.put(null, "siddharth"); wrong
        // tm.put("mama",null); wrong
        System.out.println(tm);
    }
}
