public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4 , 6, 7, 8};
        int target = 7;
        int high = arr.length-1;
        int low = 0;

        while (low <= high) {
            int mid = (high+low) / 2;
            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                break;
            }
            else if (target > arr[mid]) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
    }
}
