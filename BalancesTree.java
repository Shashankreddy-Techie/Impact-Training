public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 10, 15, 20, 35, 50};
        int target = 15;

        int result = binarySearch(array, target);

        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index: " + result);
    }
}
