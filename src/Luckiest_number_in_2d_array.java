import java.util.ArrayList;
import java.util.List;

public class Luckiest_number_in_2d_array {
    public static void main(String[] args) {
        int[][] arr = {
                {3,7,8},{9,11,13},{15,16,17}
        };
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
            l1.add(min);
        }
        System.out.println("Minimum of each row: " + l1);
        for(int j=0;j<arr.length;j++)
        {
            int max=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
            l2.add(max);
        }
        System.out.println("Maximum of each column: " + l2);
        for(int i=l1.size()-1;i>=0;i--)
        {
            for(int j=0;j<l2.size();j++)
            {
                if(l1.get(i)==l2.get(j))
                {
                    System.out.println("Luckiest number is: " + l1.get(i));
                    return; // Exit after finding the first luckiest number
                }
            }
        }
    }
}
