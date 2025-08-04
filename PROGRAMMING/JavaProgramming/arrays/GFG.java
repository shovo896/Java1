import java.io.*;
import java.util.*;

class GFG {
    // Main method 
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        // appenfing new elements at the end of the list 
        for(int i=0;i<5;i++)
        al.add(i);
        System.out.println(al);
        // Remove element at index 2
        al.remove(3);
        System.out.println(al);
        //printing the element at index 2
        for(int i=0;i<al.size();i++)
           System.out.println(al.get(i));

    }
    
}
