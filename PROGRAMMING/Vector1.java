import java.io.*;
import java.util.*;

class Vector1 {
    public static void main(String[] args)   {
        //Main method 
        Vector<Integer> v= new Vector<Integer>();
        // Adding elements to the vector
        for(int i =1;i<=5;i++)
            v.add(i);
            // Printing the vector
        System.out.println("Vector: " + v);
        // Removing the element at index 2
        v.remove(2);
        // Printing the vector after removing an element
        
        System.out.println(v);
        // printing the element at index 2
        for(int i=0;i<v.size();i++)
            System.out.println("Element at index " + i + ": " + v.get(i));
    } 
}
