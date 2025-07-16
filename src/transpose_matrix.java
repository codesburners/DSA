public class transpose_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        int[][]  newMat=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                newMat[j][i]=matrix[i][j];
            }

        }
        for(int i=0;i<newMat.length;i++)
        {
            for(int j=0;j<newMat[0].length;j++)
            {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
