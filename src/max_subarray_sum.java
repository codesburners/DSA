import java.util.Arrays;

public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] result = maxSubArray(arr);
        System.out.println("Max subarray sum is: " + Arrays.toString(result));

    }
    static int[] maxSubArray(int[] arr)
    {
        int max=arr[0];int start=0;int end=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum>max)
                {
                    max=sum;
                    start=i;
                    end=j;

                }


            }



        }
        return Arrays.copyOfRange(arr, start, end + 1);
    }

}
