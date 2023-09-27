import java.util.*;

public class HashMapAndLinkedHahMapOperations {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        HashMap hm2 = new HashMap();

        // put();
        // adding the element
        System.out.println("put() : ");
        hm.put(1, "madhav");
        hm.put(2, "parth");
        hm.put("manthan", 3);
        hm.put(null, null);
        hm.put(null, "Madhav");
        hm.put(4, "madhav");
        System.out.println(hm);
        System.out.println();

        // remove()
        // using the remove method we can actually remove the element based on the key.
        System.out.println("remove() : ");
        System.out.println(hm);
        hm.remove(2);
        System.out.println(hm);
        System.out.println();

        // clear()
        // clear() method is used to clear the map.
        // hm.clear();
        // System.out.println(hm);

        // containsKey()
        // chack the specific key is present or not if key is present then ans is True
        // and if key is not preseent than ans is false.
        System.out.println("containsKey() : ");
        System.out.println(hm);
        System.out.print(hm.containsKey(20) + " ");
        System.out.print(hm.containsKey(1) + " ");
        System.out.println(hm.containsKey("manthan"));
        System.out.println();

        // containsValue()
        // chack a specific value present in the map or not if present then it is show
        // than True and if it is not possible than it is called false.
        // System.out.print("containsValue() : ");
        System.out.println("containsValues() : ");
        System.out.println(hm);
        System.out.println(hm.containsValue("parth"));
        System.out.println(hm.containsValue("madhav"));
        System.out.println();

        // .equals();
        // chack the 2 map same or not.
        System.out.println(".equals() : ");
        System.out.println("hm : " + hm);
        hm2.put(1, "m");
        hm2.put(2, "p");
        hm2.put("manthan", 3);
        hm2.put(null, null);
        hm2.put(null, "M");
        hm2.put(4, "m");
        System.out.println("hm2 : " + hm2);

        System.out.print("Check the hm and hm2 same or not : ");
        System.out.println(hm.equals(hm2));
        System.out.println();

        // get()
        // with this method if we can enter the key then we get value which is present
        // in this particular key.
        System.out.println("get() : ");
        System.out.println(hm);
        System.out.println(hm.get("manthan"));
        System.out.println();

        // hashCode()
        // This method is used to generate a hashCode for the given map containing key
        // and values.
        System.out.println("hashCode() : ");
        System.out.println(hm);
        System.out.println(hm.hashCode());
        System.out.println();

        // isEmpty()
        // This method is used to check if a map is having any entry for key and value
        // pairs. If no mapping exists, then this returns true.
        System.out.println("isEmpty() : ");
        System.out.println(hm);
        System.out.println(hm.isEmpty());
        System.out.println();

        // .putAll()
        // put the second map in the first map using this method but if we have same key
        // in the main map and second map then key value is considerd which is present
        // in the first(main)(parent) map. .
        System.out.println("putAll() : ");
        System.out.println(hm);
        hm2.putAll(hm);
        System.out.println(hm2);
        System.out.println();

        // entrySet()
        // It basically returns a set view of the map or we can create a new set and
        // store the map elements into them.
        System.out.println("entrySet() : ");
        System.out.println(hm);
        System.out.println(hm.entrySet());
        System.out.println();

        // keySet()
        // This method is used to return a Set view of the keys contained in this map.
        // The set is backed by the map, so changes to the map are reflected in the set,
        // and vice-versa.
        // in short from using this method we can creat a set of key.
        System.out.println("keySet() : ");
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println();

        // values()
        // this method is use for a get a values which is prresent in the map.
        System.out.println("values() : ");
        System.out.println(hm);
        System.out.println(hm.values());
        System.out.println();

        /*
         * in the HashMap order of insertion cannot be maintained so we can use a
         * LinkedHashMap for preserve the insertion order.
         */

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(2, 34);
        lhm.put(6, 56);
        lhm.put(8, 78);
        lhm.put(9, 89);
        System.out.println(lhm);
    }
}