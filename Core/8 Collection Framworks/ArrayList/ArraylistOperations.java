import java.util.*;

public class ArraylistOperations {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        // add
        // add the value in the arraylist.
        // from the add keyword we can actually add a element in specific place and
        // which element present in this place is move to the right.
        // Time complexity : O(1)
        list1.add(5);
        list1.add(4);
        list1.add(8);
        list1.add("madhav");
        System.out.println(list1);
        // list1.add(1, 54);
        // System.out.println(list1);

        // get
        // get the value which is present in the arraylist from the index number.
        // Time complexity : O(1)
        int element = (int) list1.get(2); // (int) lakhvu pade because apdi ArrayList che te mix che String ne int ma.
        String element2 = (String) list1.get(3);
        System.out.println(element);
        System.out.println(element2);

        // remove / delete
        // remove the element from the arraylist from the specific index.
        // Time complexity : O(n)
        list1.remove(2);
        System.out.println(list1);

        // set
        // from this function we change a value which is present in the specific index
        // this function can change the value, cannot add and after the element chn
        // change their position in right way.
        // Time complexity : O(n)
        list1.set(0, 22);
        System.out.println(list1);

        // Contins / chack the value present or not
        // from this keyword we chake the element which is present in the arraylist or
        // not.
        // Time complexity : O(n)
        System.out.println(list1.contains(11));
        System.out.println(list1.contains(22));

        // size()
        // this is not a keyword this is an method present in the arraylist.
        // from this method we can find a lenghth of an arraylist.
        // this method is ectually used in the loop.
        System.out.println(list1.size());

        // sort an Arraylist
        // import java.util.collections;

        Collections.sort(list1);
    }
}