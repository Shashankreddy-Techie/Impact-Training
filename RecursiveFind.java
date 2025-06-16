// BinarySearch.java

public class BinarySearch {

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, target, low, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(nums, target, 0, nums.length - 1);
        System.out.println("Index of " + target + ": " + result);
    }
}
