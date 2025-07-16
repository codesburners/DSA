public class prac2 {
    public static void main(String[] args) {
        int[] arr = {-10,-8,-2,1,2,5,6};

        int target=0;
       int right=0;
       int left=arr.length-1;
       while(right<=left)
       {
           int sum=arr[right]+arr[left];
           if(sum==target)
           {
                System.out.println("Pair found: " + right + ", " + left);
                return;
              }
              else if(sum<target)
              {
                right++;
              }
              else
              {
                left--;
           }
       }

    }
}
