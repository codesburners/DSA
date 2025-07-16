public class diagonal_matrix_sum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                if(i==j || i+j==n-1)
                {
                    sum+=matrix[i][j];
                }

            }

        }
        System.out.println("Sum of diagonal elements: " + sum);




    }
}
