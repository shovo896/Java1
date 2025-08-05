import java.util.*;

public class HashMapDemo {
    //creating HashMap 
    // main method 
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Red");
        hm.put(2,"Green");
        hm.put(3,"Blue");
        hm.put(4,"Black");
        System.out.println("Value for key 1: " + hm.get(1));
        for(Map.Entry<Integer,String> e:hm.entrySet())
        System.out.println(e.getKey()+" "+e.getValue());











    }
    
}
