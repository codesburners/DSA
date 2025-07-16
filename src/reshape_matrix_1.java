public class reshape_matrix_1 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8};
        int r = 2;
        int c = 4;
        int[][] matrix = new int[r][c];
        if(arr.length != r * c) {
            System.out.println("Cannot reshape the matrix with the given dimensions.");
            return;
        }
        for(int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             matrix[i][j]=arr[i*c+j];
         }
        }
        System.out.println("Reshaped Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
