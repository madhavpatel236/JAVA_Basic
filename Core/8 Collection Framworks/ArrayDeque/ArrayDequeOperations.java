import java.util.*;

/*
- ArrayDeque is  saving a insertion order means  line by line value can be save.
- inArrayDeque we can no enter a value in specific index.
- we can add both type of data homogenous type data or Heterojinios type of data.


 */
public class ArrayDequeOperations {
    public static void main(String[] args) {

        ArrayDeque aq = new ArrayDeque();

        // add()
        // preserve the insertion order.
        System.out.println("Add");
        aq.add(100);
        aq.add(0);
        aq.add(2);
        aq.add(153);
        aq.add(134);
        aq.add(10);
        aq.add("Madhav");
        System.out.println(aq);

        // addFirst()
        // add the value from the first.
        System.out.println("addFirst");
        System.out.println(aq);
        aq.addFirst(112);
        System.out.println(aq);

        // addLast()
        // add the value from the last.
        System.out.println("addLast");
        System.out.println(aq);
        aq.addLast(234);
        System.out.println(aq);

        // offer
        // - add the element at the last but some time that cannot be add.
        // - this is defered from the add() because in the add element must be aadd but
        // in this method element can be added or cannot be added.
        System.out.println("offer");
        System.out.println(aq);
        aq.offer(0);
        aq.offer(0);
        System.out.println(aq);

    }
}

/*
 * - peek() This method is used to retrieve the element at the head of the deque
 * but doesn’t remove the element from the deque. This method returns null if
 * the deque is empty.
 * - peekFirst() This method is used to retrieve the element at the head of the
 * deque but doesn’t remove the element from the deque. This method returns null
 * if the deque is empty.
 * - peekLast() This method is used to retrieve the element at the tail of the
 * deque but doesn’t remove the element from the deque. This method returns null
 * if the deque is empty.
 * - poll() This method is used to retrieve and remove the element at the head
 * of the deque. This method returns null if the deque is empty.
 * - pollFirst() This method is used to retrieve and remove the element at the
 * head of the deque. This method returns null if the deque is empty.
 * - pollLast() This method is used to retrieve and remove the element at the
 * tail of the deque. This method returns null if the deque is empty.
 * - pop() This method is used to remove an element from the head and return it.
 * - push(element) This method is used to add an element at the head of the
 * queue.
 * - removeFirst() This method is used to remove an element from the head of the
 * queue.
 * - removeLast() This method is used to remove an element from the tail of the
 * queue.
 * - size() This method is used to find and return the size of the deque.
 */