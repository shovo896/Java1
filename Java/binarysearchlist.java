import java.util.Arrays;
import java.util.stream.IntStream;

class binarysearchlist {
    private static boolean isElementPresent(int[]arr,int key){
        boolean res=Arrays.asList(arr).contains(key);
        return res; // Element found or not found

        }
        public static void main(String[]args){
            int arr[] = {1, 2, 3, 4, 5};
            int key = 8;
            boolean result = isElementPresent(arr, key);
            System.out.println("Is the element " + key + " present in the array? " + result);
        }
    
}
