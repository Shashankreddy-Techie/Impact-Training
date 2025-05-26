import java.util.Arrays; // For printing arrays

public class MergeSort {

    /**
     * Main method to demonstrate MergeSort.
     */
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);

        int[] arr2 = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("\nOriginal array 2:");
        printArray(arr2);
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array 2:");
        printArray(arr2);
    }

    /**
     * The main function that sorts arr[l..r] using merge().
     * arr[] --> Array to be sorted,
     * l  --> Starting index,
     * r  --> Ending index.
     */
    public static void mergeSort(int[] arr, int l, int r) {
        // Base case: if the sub-array has 0 or 1 element, it's already sorted
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2; // Avoids potential overflow compared to (l+r)/2

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     */
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temporary arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /* Copy data to temporary arrays L[] and R[] */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temporary arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * A utility function to print array of size n
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
