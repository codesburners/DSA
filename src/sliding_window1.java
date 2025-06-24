public class sliding_window1 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=3;
        int sum=0;
        int max=arr[0];
        int startIndex=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i]-arr[i-k];
            if(sum>max)
            {
                max=sum;
                startIndex=i-k+1; // Update the starting index of the subarray
            }

        }
        int min=arr[startIndex];
        for(int i=startIndex+1;i<startIndex+k;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Max sum of subarray of size " + k + " is: " + min);


    }
}
