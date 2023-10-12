package com.safikul;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylistexample {
    public static void main(String[] args) {

        //Syntax
        ArrayList<Integer> list= new ArrayList<>();

        list.add(23);
        list.add(232);
        list.add(8803);

        System.out.println("The list of ArrayList is "+ list);

        //getting the 2nd index element of the ArrayList
        int elem=list.get(2);
        System.out.println("getting the element " +elem);


        //Changing the ArrayList in Index 2 & putting the value 3
        list.set(2,3);
        System.out.println("Changing the ArrayList "+ list);


        //Adding the Element as per own index
        list.add(1,2);
        System.out.println("Adding the Element as per own index "+ list);

        // deleting the element
        list.remove(2);
        System.out.println("After Deleting the Element "+ list);

        //Length of the ArrayList
        System.out.println("The size of the ArrayList is "+list.size());
        //Sorting the ArrayList
        Collections.sort(list);
        System.out.println("The sorted ArrayList : " + list);

    }
}
