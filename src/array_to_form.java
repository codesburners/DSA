import java.util.*;

public class array_to_form {
    public static void main(String[] args) {
        int [] arr={9,9,9,9,9,9,9,9,9,9};
        int num=0;
        int k=1;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            num=num*10+arr[i];
        }
        System.out.println(num);


        // If you want to add a constant k to the number formed
        num=num+k;
        String numStr = String.valueOf(num);
        int[] ans = new int[numStr.length()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=numStr.charAt(i)-'0'; // Convert character to integer
        }
        // Print the updated array
        for(int i=0;i<ans.length;i++)
        {
            result.add(ans[i]);
        }
        System.out.println(result.toString());
        System.out.println(numStr);
    }
}
