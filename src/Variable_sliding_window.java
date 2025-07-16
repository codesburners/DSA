public class Variable_sliding_window {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k=8;
        int start=0;int maxLen=0;int sum=0;int e=0;
        for(int end=0;end<arr.length;end++)
        {
            sum+=arr[end];
            while(sum>k)
            {
                sum-=arr[start];
                start++;
            }
            e=end;
            maxLen=Math.max(maxLen,end-start+1);
        }
        System.out.println("Maximum length of subarray with sum less than or equal to " + k + " is: " + maxLen);
        System.out.println("Subarray with maximum length:");
//        for(int i=start;i<=e;i++)

    }
}
