import java.util.*;

class LinkedListOperations {
    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();

        // add()
        // - from the add keyword we can actually add the value at a specific place or
        // index.
        // - add the value in the LisnkedList.
        // - Time complexity : O(1)
        System.out.println("add :");
        ll1.add(5);
        ll1.add(4);
        ll1.add(8);
        ll1.add(23);
        ll1.add("madhav");
        System.out.println(ll1);
        ll1.add(2, 6);
        System.out.println(ll1);

        // set()
        // - from the set keyword we can actually set(REPLACE) a value of specific index
        // in LinkedList
        System.out.println("set :");
        System.out.println(ll1);
        ll1.set(0, "patel");
        System.out.println(ll1);
        // - System.out.println(ll1.set(2, "parth")); //this is incorrect way to
        // implement this method.
        ll1.set(2, "parth");
        System.out.println(ll1);

        // get()
        // from this keyword we can actually get the value of a specific index.
        // ll1.get(2); this is wrong for this method.
        System.out.println("get :");
        System.out.println(ll1);
        System.out.println(ll1.get(2));

        // push()
        // - from this method we can actually add the value from the front.
        System.out.println("push :");
        System.out.println(ll1);
        ll1.push(1);
        System.out.println(ll1);

        // pop()
        // - from this keyword we can actually remove the value from the front.
        System.out.println("pop :");
        System.out.println(ll1);
        ll1.pop();
        System.out.println(ll1);

        // peek
        // giving the value which is present in the first index.
        System.out.println("peek :");
        System.out.println(ll1);
        System.out.println(ll1.peek());
        System.out.println(ll1);

        // poll
        // giving the value which is present in the first index.
        // this is different from the peek because in the peek element can't remove but
        // from the poll element can remove after call the poll().
        System.out.println("Poll :");
        System.out.println(ll1);
        System.out.println(ll1.poll());
        System.out.println(ll1);

        // addfirst()
        // - from this keyword we can actually add the element from the front.
        System.out.println("addFirst :");
        System.out.println(ll1);
        ll1.addFirst("addFirst");
        System.out.println(ll1);

        // addlast()
        // - from this keyword we can actually insert the value from the last.
        System.out.println("addLast :");
        System.out.println(ll1);
        ll1.addLast("addLast");
        System.out.println(ll1);

        // remove()
        // - this method is generally use for remove the elements in the LinkedList
        // there are three types (i) without an argument (ii) passing an index in
        // argument (iii) passing an object in arguent
        System.out.println("remove :");
        System.out.println(ll1);
        ll1.remove();
        System.out.println(ll1); // from no argu we can remove the element from the first index
        ll1.remove(1);
        System.out.println(ll1); // from the giving an index no in arug we can remove specific element
        ll1.remove("madhav");
        System.out.println(ll1); // form giving an object we can remove this object specifcally. if there are
                                 // same object present then we can remove first element in the base of index no

        // removeFirst()
        // remove the first element which is present in the 0th index.
        System.out.println("removeFirst :");
        System.out.println(ll1);
        ll1.removeFirst();
        System.out.println(ll1);

        // removeLast()
        // remove the last element.
        System.out.println("removeLast :");
        System.out.println(ll1);
        ll1.removeLast();
        System.out.println(ll1);

        // clone
        // - clone the LinkedList
        System.out.println("clone :");
        System.out.println(ll1);
        System.out.println(ll1.clone());

        // contains
        System.out.println("contains :");
        System.out.println(ll1);
        System.out.println(ll1.contains(8));
        System.out.println(ll1.contains(12));

    }
}
