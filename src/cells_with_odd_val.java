public class cells_with_odd_val {
    public static void main(String[] args) {

        int[][] indices = {
                {0,1},
                {1,1}
        };
        int count=0;
        int[] row=new int[2];
        int[] col=new int[3];
        for(int[] x:indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(row[i]+col[j]%2!=0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);






    }
}
