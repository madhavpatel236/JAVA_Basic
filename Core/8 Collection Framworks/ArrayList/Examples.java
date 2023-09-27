import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// // print a revese an Arrayllsit.

// public class Examples {
// public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(2);
// list.add(3);
// System.out.println("current Arraylist is : " + list);
// System.out.println("Reverse of an Arraylist is :");

// for (int i = list.size() - 1; i >= 0; i--) {
// System.out.print(list.get(i) + " ");
// }
// }
// }

// // Find a maximun element which is present in an ArrayList.

// public class Examples {
// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(44);
// list.add(3);
// list.add(4);
// list.add(53);
// System.out.println("List is : " + list);

// int max = 0;
// for (int i = 0; i < list.size(); i++) {
// if (max < list.get(i)) {
// max = list.get(i);
// // max = math.max(max, list.get(i))
// }
// }
// System.out.println(max);
// }
// }

// // swap two numbers

// class Examples {
// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);
// System.out.println(list);

// int index1 = 1;
// int index2 = 3;

// int temp = list.get(1);
// list.set(index1, list.get(index2));
// list.set(index2, temp);

// System.out.println(list);
// }
// }

// // sorting an array

// class Examples {
// public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<>();

// list.add(1);
// list.add(62);
// list.add(33);
// list.add(4);
// list.add(35);
// list.add(6);
// System.out.println(list);

// Collections.sort(list);
// System.out.println(list);

// }
// }

// // 2D ArrayList

// class Examples {
// public static void main(String[] args) {

// ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); // this is a
// declaration of an 2D array.

// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(2);
// list.add(3);
// mainList.add(list);

// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(11);
// list2.add(22);
// list2.add(33);
// mainList.add(list2);

// ArrayList<Integer> list3 = new ArrayList<>();
// list3.add(111);
// list3.add(222);
// list3.add(333);
// mainList.add(list3);

// System.out.println(mainList);
// }
// }

// class Examples {
// public static void main(String[] args) {

// ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(2);
// list.add(3);
// mainList.add(list);

// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(11);
// list2.add(22);
// list2.add(33);
// mainList.add(list2);

// ArrayList<Integer> list3 = new ArrayList<>();
// list3.add(111);
// list3.add(222);
// list3.add(333);
// mainList.add(list3);

// for (int i = 0; i < mainList.size(); i++) {
// ArrayList curlist = mainList.get(i);
// for (int j = 0; j < curlist.size(); j++) {
// System.out.print(curlist.get(j) + " ");
// }
// System.out.println();
// }

// }
// }

// class Examples {
// public static void main(String[] args) {

// ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

// ArrayList<Integer> list1 = new ArrayList<>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>();

// for (int i = 1; i < 6; i++) {
// list1.add(i * 1); // 1 2 3 4 5
// list2.add(i * 2); // 2 4 6 8 10
// list3.add(i * 3); // 3 6 9 12 15
// }
// mainlist.add(list1);
// mainlist.add(list2);
// mainlist.add(list3);

// for (int i = 0; i < mainlist.size(); i++) {
// ArrayList<Integer> curlist = mainlist.get(i);
// for (int j = 0; j < curlist.size(); j++) {
// System.out.print(curlist.get(j) + " ");
// }
// System.out.println();
// }
// }
// }