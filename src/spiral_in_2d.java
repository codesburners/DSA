public class spiral_in_2d {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       for(int j=0;j<arr[0].length;j++)
       {
              System.out.print(arr[0][j]+" ");
              if(j==arr[0].length-1)
              {
                  for(int i=1;i<arr.length;i++)
                  {
                      System.out.print(arr[i][j]+" ");
                      if(i==arr.length-1)
                      {
                          for(int k=arr[0].length-2;k>=0;k--)
                          {
                              System.out.print(arr[i][k]+" ");
                              if(k==0)
                              {
                                  for(int l=arr.length-2;l>0;l--)
                                  {
                                      System.out.print(arr[l][0]+" ");
                                      if(l==1)
                                      {
                                          System.out.print(arr[1][1]+" ");
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
       }
    }
}
