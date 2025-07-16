public class plus_one {
    public static void main(String[] args) {
        int[] dig={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        long sum=0;

        for(int i=0;i<dig.length;i++)
        {
            sum=sum*10+dig[i];
            System.out.println("Current sum: " + sum);
        }
        sum=sum+1;
//        System.out.println(sum);
        String str= String.valueOf(sum);
        int temp[] = new int[str.length()]; // Create a temporary array to hold the digits
        for(int i=0;i<str.length();i++)
        {
            if(i<str.length())
            {
                temp[i]=Character.getNumericValue(str.charAt(i));// Convert character to integer
            }
            else
            {
                temp[i]=0; // Fill remaining digits with 0 if the new number is longer
            }
        }
        // Print the updated array
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
