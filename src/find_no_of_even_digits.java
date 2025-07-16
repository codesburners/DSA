public class find_no_of_even_digits {
    public static void main(String[] args) {
       int [] nums = {12, 345, 2, 6, 7896};
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
           String str=String.valueOf(nums[i]);
           int len=str.length();
           if(len%2==0)
           {
               count++;
           }
       }
        System.out.println(count);
    }
}
