import java.util.Arrays;

public class reshape_matrix {
    public static void main(String[] args) {
        int[][] arr={
                {1, 2},
                {3,4}};
        int r=1;
        int c=4;
        int[][] ans=new int[r][c];
        int n=arr[0].length;
        if(r*c!=arr.length*arr[0].length)
        {
            System.out.println("Cannot reshape matrix");
        }
        for(int i=0;i<r*c;i++)
        {
            ans[i/c][i%c]=arr[i/n][i%n];
        }

            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }

    }
}
