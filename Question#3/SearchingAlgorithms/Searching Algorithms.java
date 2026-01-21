class SearchingAlgorithms {

    //  Binary Search – Iterative
    static int binarySearchIterative(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Binary Search – Recursive
    static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearchRecursive(arr, mid + 1, high, target);
        else
            return binarySearchRecursive(arr, low, mid - 1, target);
    }

    // Recursive Linear Search
    static int linearSearchRecursive(int[] arr, int index, int target) {
        if (index == arr.length)
            return -1;

        if (arr[index] == target)
            return index;

        return linearSearchRecursive(arr, index + 1, target);
    }

    //  Find Minimum (Recursive)
    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        return Math.min(arr[index], findMin(arr, index + 1));
    }

    //  Find Maximum (Recursive)
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];

        return Math.max(arr[index], findMax(arr, index + 1));
    }


    public static void main(String[] args) {

        int[] arr = {3, 8, 12, 20, 25, 30};

        System.out.println("Binary Search Iterative (20): "
                + binarySearchIterative(arr, 20));

        System.out.println("Binary Search Recursive (25): "
                + binarySearchRecursive(arr, 0, arr.length - 1, 25));

        System.out.println("Recursive Linear Search (12): "
                + linearSearchRecursive(arr, 0, 12));

        System.out.println("Minimum: " + findMin(arr, 0));
        System.out.println("Maximum: " + findMax(arr, 0));
    }
}
