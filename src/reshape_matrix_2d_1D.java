public class reshape_matrix_2d_1D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       int[] arr=new int[matrix.length * matrix[0].length];
       int index=0;
       for(int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix[0].length;j++)
           {
               arr[index++]=matrix[i][j];
           }
       }
       for(int num : arr) {
           System.out.print(num + " ");
       }
    }
}
