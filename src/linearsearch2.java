public class linearsearch2 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int start =2;
        int end=8;
        int result = lineaeSearch(arr, target,start,end);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    static int lineaeSearch(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=start;index<end;index++)
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
