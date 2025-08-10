import java.io.*;
import java.util.*;

public class Addcollec {
    public static void main(String[] args){
        Collection<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        for(Integer i : l1) {
            System.out.println(i);
        }
        Collection<Integer> l2 = new ArrayList<Integer>();
        l2.addAll(l1);
        System.err.println("The new array list is:"+ l2);









    }
    
}
