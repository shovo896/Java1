import java.util.Arrays;
import java.util.stream.IntStream;


class binaryseAach2 {
    private static boolean isElementPresent(int[]arr,int key){
        Arrays.sort(arr);
        int res= Arrays.binarySearch(arr, key);
        if(res < 0){
            return false;
             // Element not found
        }
        return true; // Element found


        

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 3;
        boolean result = isElementPresent(arr, key);
        System.out.println("Is the element " + key + " present in the array? " + result);
    }
    
}
