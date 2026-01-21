public class RecursionProb {

        //  Factorial using recursion
        static int factorial(int n) {
            // Base case
            if (n == 0 || n == 1)
                return 1;

            // Recursive case
            return n * factorial(n - 1);
        }

        //  Fibonacci using recursion
        static int fibonacci(int n) {
            // Base case
            if (n == 0)
                return 0;
            if (n == 1)
                return 1;

            // Recursive case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        //  Sum of array elements using recursion
        static int sumArray(int[] arr, int index) {
            // Base case
            if (index == arr.length)
                return 0;

            // Recursive case
            return arr[index] + sumArray(arr, index + 1);
        }

        // Check if array is sorted using recursion
        static boolean isSorted(int[] arr, int index) {
            // Base case
            if (index == arr.length - 1)
                return true;

            // Recursive case
            if (arr[index] > arr[index + 1])
                return false;

            return isSorted(arr, index + 1);
        }

        //  Find minimum element using recursion
        static int findMin(int[] arr, int index) {
            // Base case
            if (index == arr.length - 1)
                return arr[index];

            // Recursive case
            return Math.min(arr[index], findMin(arr, index + 1));
        }

        //  Find maximum element using recursion
        static int findMax(int[] arr, int index) {
            // Base case
            if (index == arr.length - 1)
                return arr[index];

            // Recursive case
            return Math.max(arr[index], findMax(arr, index + 1));
        }

        
        public static void main(String[] args) {

            System.out.println("Factorial of 5: " + factorial(5));

            System.out.println("Fibonacci at position 6: " + fibonacci(6));

            int[] arr1 = {2, 4, 6, 8};
            System.out.println("Sum of array: " + sumArray(arr1, 0));

            int[] arr2 = {3, 5, 7, 9};
            System.out.println("Is array sorted? " + isSorted(arr2, 0));

            System.out.println("Minimum: " + findMin(arr1, 0));
            System.out.println("Maximum: " + findMax(arr1, 0));
        }
    }


