import java.io.*;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        ///////////////////////////////
        arr.add("Nikita");
        arr.add("Bhoyar");
        arr.add("IT ");
        arr.add("3rd year  ");
        arr.add("6th SEM");
        System.out.println(arr);
        ////////////////////////////////////
        arr.add(1, "Moreshwar");// koi b index pe kabi b add kar sakte
        System.out.println(arr);
        ////////////////////////////////////
        arr.remove(3);
        System.out.println(arr);
        ////////////////////////////////////
        arr.set(3, "III year ");
        System.out.println(arr);
        /////////////////// ITERATING ELEMEENTS /////////////////
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for (String s : arr) {
            System.out.print(s + " ");
        }
        //////////////////////////////////////////
        // addAll used to append all elements from existing array
        System.out.println();
        ArrayList<String> arr1 = new ArrayList<>();
        // arr1.addAll(arr);
        // for (String s1 : arr1) {
        // System.out.print(s1 + " ");
        // }

        //////////////////////////////
        // Used to insert all of the elements starting at the specified position from a
        // specific collection into the mentioned list.
        arr1.add(" first ");
        arr1.add(" second ");

        arr1.addAll(2, arr);
        for (String s1 : arr1) {
            System.out.print(s1 + " ");
        }

        ///////////////////////////////
        // clear(): used to remove all elements from ArrayList
        System.out.println();
        // arr1.clear();
        System.out.println(" Nothing is here! ");

        for (String s1 : arr1) {
            System.out.print(s1 + " ");
        }

        //////////////////////////////
        // contains(Object o): Returns true if this list contains the specified element.
        System.out.print(arr1.contains("first "));// false
        System.out.print(arr1.contains(" first "));// true
        // here space matters

        ////////////////////////////////////
        // subList(int fromIndex, int toIndex): Returns a view of the portion of this
        // list between the specified fromIndex, inclusive, and
        // toIndex, exclusive.
        System.out.println();
        System.out.print(arr1.subList(2, 5));

        ////////////////////////////////
        // The ensureCapacity() method of java.util.ArrayList class increases the
        // capacity of this ArrayList instance, if
        // necessary, to ensure that it can hold at least
        // the number of elements specified by the minimum
        // capacity argument.
        // ensureCapacity(int minCapacity)

        arr1.ensureCapacity(10);

        // Print
        System.out.println("ArrayList can now surely store upto 10 elements.");
    }
}
