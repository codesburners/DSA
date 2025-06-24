public class Kids_with_max_candies {
    public static void main(String[] args) {
        int candies[] = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        int max=candies[0];
    for(int num: candies)
        {
            if(num>max)
            {
                max=num;
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {

                System.out.print("true ");
            }
            else
            {
                System.out.print("false ");
            }
        }
    }
}
