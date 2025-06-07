public class max {
    public static void main(String[] args) {
        int [] arr ={
                1, 2, 3, 4, 5, 6, 7
        };
        System.out.println("Max array --->" + max(arr));
        System.out.println("Max range --->" + maxRange(arr, 0, 5));
        reverse(arr, 0, 6);

    }
    static int max(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr,int start,int end)
    {
        int max=arr[0];
        for(int i=start;i<end;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static void reverse(int[] arr,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
