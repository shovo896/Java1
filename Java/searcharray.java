import java.util.Arrays;
import java.util.stream.IntStream;


class searcharray {
    private static boolean isElementPresent(int[] arr, int key) {
        for(int element : arr) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int key = 3;
        boolean result = isElementPresent(arr, key);
        System.out.println("Is the element " + key + " present in the array? " + result);
    }
    
}
