package DSA;

public class BinarySearchByRecursion {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56};
        int target = 23;

        int index = binarySearch(arr, 0, arr.length - 1, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }


    public static int binarySearch(int[] arr, int left, int right, int target) {


        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        // Element found
        if (arr[mid] == target) {
            return mid;
        }


        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }


        return binarySearch(arr, mid + 1, right, target);
    }
}
