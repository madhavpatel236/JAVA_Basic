import java.util.*;

public class IteratorOperation {
    public static void main(String[] args) {

        HashMap m = new HashMap();
        m.put(1, "one"); // Entry
        m.put(2, "two");
        m.put(3, "Three");
        m.put(4, "Four");
        System.out.println(m);

        // Here we cannnot directlly use the m.iterator so for get the key we can add
        // the below line.
        Set s = m.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next(); // here we downcast the key because key stored as a object and we want a
                                              // integer.
            System.out.println(i);
            // System.out.println(itr.next());
        }

        // values stored into the collection so we can create a object with collection.
        Collection c = m.values();
        Iterator itr2 = c.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        Set s2 = m.entrySet();
        Iterator itr3 = s2.iterator();
        while (itr3.hasNext()) {
            Map.Entry e = (Map.Entry) itr3.next(); // in this case we cannot downcast as a integer or string because key
                                                   // is an integer an values are string. so mix of key and values calld
                                                   // a Entry so the type in entry and present in the map so we can down
                                                   // cast as well as type is Map.Entry.
            System.out.println(e);
            // System.out.println(itr3.next());
        }

    }
}
