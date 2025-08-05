import java.util.*;

public class HashSetDemo {
    public static void main(String args[]) {
        // craeting a hash set adding elements
        HashSet<String> hs=new HashSet<String>();
        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Black");
        hs.add("White");
        hs.add("Pink");
        // Traversing elements
        System.out.println("HashSet: " + hs);
        Iterator<String> i = hs.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }


    }
    
}
