package com.safikul;

public class basics {
    public static void main(String[] args) {

        //concatation
        String name1= "safikul";
        String name2="alam";
        String fullname=name1+" "+name2;
        System.out.println("The concatation result is: "+ fullname);


        //comparing the strings
        if(name1.compareTo(name2)==0){
            System.out.println("The strings are same");
        }
        else
            System.out.println("The Strings are not same");
    }
}
