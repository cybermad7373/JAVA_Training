package ArraysS;

public class BinarySearch {
    public static int Search(int arr[], int lb, int ub, int ele) {
        if (ub >= lb) {
            int m = lb + (ub - lb) / 2;
            if (arr[m] == ele) {
                return m;
            } else if (arr[m] > ele) {
                return Search(arr, lb, m - 1, ele);
            } else {
                return Search(arr, m + 1, ub, ele);
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 1, 1, 1, 2};
        int ele = 21;
        int val = Search(arr, 0, arr.length - 1, ele);
        if (val == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + val);
        }
    }
}
