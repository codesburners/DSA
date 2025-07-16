import java.util.Map;

public class chips_with_minimum_cost {
    public static void main(String[] args) {
        int[] position={1, 2, 3, 4, 5};
        int even=0;int odd=0;
        for(int pos:position)
        {
            if(pos%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(Math.min(even,odd));
    }
}
