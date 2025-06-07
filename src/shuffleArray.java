public class shuffleArray {
    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 3, 4, 7};
        int n=3;
        int[] x=new int[n];
        int[] y=new int[n];
        int[] res=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            x[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            y[i]=nums[i+n];
        }

        for(int i=0,k=0;i<n;i++)
        {
            res[i++]=x[i];


        }

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] + " ");
        }


    }
}
