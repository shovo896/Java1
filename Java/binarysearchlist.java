import java.util.Arrays;
import java.util.stream.IntStream;


class binarysearchList {
    private static boolean isElementPresent(int[] arr, int key) {
        // Loop through the primitive array manually
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 8;
        boolean result = isElementPresent(arr, key);
        System.out.println("Is the element " + key + " present in the array? " + result);
    }
}
