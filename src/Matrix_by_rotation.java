public class Matrix_by_rotation {
   public boolean findrotation(int[][] matrix,int[][] target){
       for(int i=0;i<4;i++)
       {
           if(areEqual(matrix,target))
           {
               return true;
           }
           matrix=rotate(matrix);

       }
       return false;
   }
   public boolean areEqual(int[][] matrix1,int[][] target)
   {
       for(int i=0;i<matrix1.length;i++)
       {
           for(int j=0;j<matrix1.length;j++)
           {
               if(matrix1[i][j]!=target[i][j])
               {
                   return false;
               }

           }
       }
       return true;
   }
   public int[][] rotate(int[][] matrix)
   {
       int n=matrix.length;
       int[][] rotated=new int[n][n];
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               rotated[j][n-1-i]=matrix[i][j];
           }
       }
       return rotated;
   }

    public static void main(String[] args) {
        int[][] matrix={
                {0,1},
                {1,0}
        };
        int[][] target={
                {1,0},
                {0,1}
        };
        Matrix_by_rotation obj=new Matrix_by_rotation();
        obj.findrotation(matrix,target);
        if(obj.findrotation(matrix,target))
        {
            System.out.println("Yes, the target matrix can be obtained by rotating the original matrix.");
        }
        else
        {
            System.out.println("No, the target matrix cannot be obtained by rotating the original matrix.");
        }
    }
}
