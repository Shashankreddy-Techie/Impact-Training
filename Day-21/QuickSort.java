public class QuickSort {

    /**
     * Main method to demonstrate QuickSort.
     */
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        printArray(arr);

        int[] arr2 = {2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nOriginal array 2:");
        printArray(arr2);
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array 2:");
        printArray(arr2);
    }

    /**
     * The main function that implements QuickSort.
     * arr[] --> Array to be sorted,
     * low  --> Starting index,
     * high  --> Ending index.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is now
               at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (than pivot) to left
     * of pivot and all greater elements to right of pivot.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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
