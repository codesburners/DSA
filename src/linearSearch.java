public class linearSearch {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int result = lineaeSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
        static int lineaeSearch(int[] arr,int target)
        {
            if(arr.length==0)
            {
                return -1;
            }
            for(int index=0;index<arr.length;index++)
            {
                if(arr[index]==target)
                {
                    return index;
                }
            }
            // this line will be exxecuted if the target is not found
            return -1;
        }
}

