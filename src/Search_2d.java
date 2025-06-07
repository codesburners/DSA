import java.util.Arrays;

public class Search_2d {

    public static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 1;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        int max=maxval(arr);
        System.out.println(max);
    }
    static int[] search(int[][] arr,int target)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1}; // this line will be executed if the target is not found
    }
    static int maxval(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)//loop runs upto arr[i].length to avoid ArrayIndexOutOfBoundsException
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }

            }
        }
        return max;
    }
}


