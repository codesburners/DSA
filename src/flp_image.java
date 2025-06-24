import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class flp_image {
    public static void main(String[] args) {


        int image[][]={
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

       for(int[] row:image)
       {
           int start=0;
           int end=image.length-1;
           while(start<end)
        {
            int temp=row[start];
            row[start]=row[end];
            row[end]=temp;
            start++;
            end--;
        }



           System.out.println(Arrays.toString(image));

       }
       for(int[] row:image)
       {
           for(int col:row)
           {

               col=col^1;

           }

       }
       for(int i=0;i<image.length;i++)
       {
           for(int j=0;j<image[i].length;j++)
           {
               System.out.print(image[i][j]+" ");
           }
           System.out.println();
       }




    }



}
