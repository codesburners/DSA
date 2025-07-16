public class Search_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int[] res=search1(arr,target);
        System.out.println("Index of target: " + res[0] + " and " + res[1]);
    }

    static int[] search1(int[] arr, int target) {
        int peak = searchPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak, true);  // ascending
        int secondTry=binarySearch(arr, target, peak + 1, arr.length - 1, false);  // descending
        return new int[]{firstTry, secondTry};
    }

    static int searchPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
