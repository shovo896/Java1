 import java.io.*;
 import java.util.*;

class GFG1 {
    // main method 
    public static void main(String[]args){
        // Declaring the Linked list 
        LinkedList<Integer> ll =new LinkedList<Integer>();
        // Adding elements to the linked list the end of the list
        for(int i=0;i<=5;i++)
            ll.add(i);
            // Printing the linked list
        System.out.println("Linked List: " + ll);
        // Removing the element at index 2
        ll.remove(3);
        // Printing the linked list after by one 
        for(int i=0;i<ll.size();i++)
            System.out.println("Element at index " + i + ": " + ll.get(i));
    }

    
}
