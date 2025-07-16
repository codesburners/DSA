public class pos_in_infinite_arr {
    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
        };
        int target = 15;

        System.out.println(answer1(arr, target));
    }

    static int answer1(int[] arr, int target) {
        int start = 0;
        int end = 1;
        //condition for the target present in the array
        while ( end < arr.length && target > arr[end] ) {
            int temp = end + 1;
            //end=previous end+size of the window*2

            end = end + (end - start + 1) * 2;
            start = temp;

        }
        // Clamp end to the last index to avoid out-of-bounds
        if (end >= arr.length) {
            end = arr.length - 1;
        }


        return binarySearch1(arr, target, start, end);
    }

        static int binarySearch1(int[] arr, int target, int start, int end){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }


    }



