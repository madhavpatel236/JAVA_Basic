// ListIterator works only on list collections means Arraylist and LinkedList.
// In the ListIterator we can access the element from the last.

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorOperations {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add(10);
        System.out.println(ll);

        ListIterator li = ll.listIterator(ll.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
