import java.util.*;


public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Black");
       //Traversing elements
       Iterator<String>itr=hs.iterator();
       while(itr.hasNext()){
              System.out.println(itr.next());
         }
    }
    
}
