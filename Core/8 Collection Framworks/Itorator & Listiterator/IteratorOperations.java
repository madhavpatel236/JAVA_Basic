// we can use a iterator for accesing the element which is present in the collections instand of loops because if we use a loop then some chance to loop go for the infinite time so our task may not complete. 
/*
 * Syntax: Iterator obj_name = collectionObj_name.iterator();
 */

import java.util.*;

class IteratorOperations {
    public static void main(String[] args) {

        ArrayDeque a1 = new ArrayDeque();
        a1.add(45);
        a1.add(56);
        a1.add(67);
        a1.add(78);
        a1.add("Madhav");
        // System.out.println(a1);

        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

/*
 * Working:
 * after the creating an object of Iterator itr start with the (-1) index and
 */