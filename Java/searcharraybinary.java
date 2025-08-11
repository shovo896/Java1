import java.util.Arrays;
import java.util.stream.IntStream;

class searcharraybinary {
    
    private static boolean isElementPresent(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return true; // Element found
            }
            if (arr[mid] < key) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return false; // Element not found
    }

    
}
