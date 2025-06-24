public class high_altitude {
    public static void main(String[] args) {
        int nums[] = {-4,-3,-2,-1,4,3,2};
        int currentSum = 0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            currentSum += nums[i];
            if(currentSum > max)
            {
                max = currentSum;
            }
        }
        System.out.println(max);

    }
}
