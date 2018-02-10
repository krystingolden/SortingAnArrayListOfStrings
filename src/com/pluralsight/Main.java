package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /*
    https://programmingbydoing.com/
    Sorting an arraylist of strings - Assignment #188
     */

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("remember");
        arr.add("what");
        arr.add("the");
        arr.add("dormouse");
        arr.add("said");
        arr.add("feed");
        arr.add("your");
        arr.add("head");


        // Display the original (unsorted values)
        System.out.print("before: ");
        for ( int i=0; i<arr.size(); i++ )
            System.out.print( arr.get(i) + " " );
        System.out.println();

        // Swap the values around to put them alphabetical order.
        Collections.sort(arr, String.CASE_INSENSITIVE_ORDER);

        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        for ( int i=0; i<arr.size(); i++ )
            System.out.print( arr.get(i) + " " );
        System.out.println();
    }
}
