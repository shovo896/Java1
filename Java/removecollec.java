import java.util.*;

public class removecollec {
    public static void main(String[]argv) throws Exception{
        // collrection of integers 
        Collection<Integer> hs1=new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println("HashSet 1: " + hs1);
        // collection of integers 
        hs1.remove(30);
        System.out.println("HashSet 1 after removing 30: " + hs1);
        // collection of integers 
        Collection<Integer> hs2=new HashSet<>();
        hs2.add(50);
        hs2.add(60);
        hs2.add(70);
        hs2.add(80);
        System.out.println("HashSet 2: " + hs2);
        // removing all elements of hs2 from hs1
        hs1.removeAll(hs2);
        System.out.println("HashSet 1 after removing all elements of HashSet 2: " + hs1);

    }
    
}
