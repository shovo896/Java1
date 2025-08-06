import java.util.ArrayList;
import java.util.Collections;



public class sortingcollec {

    public static void main(String[] args) {
        // Example usage of ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");

        // Sorting the ArrayList
        Collections.sort(colors);
        
        // Displaying sorted colors
        System.out.println("Sorted Colors: " + colors);
    }
}
