public class min_number_linear {
    public static void main(String[] args) {
        int[] arr={18,12,7,3,14,28,35,0,-1};
        System.out.println("Min number in array ---> " + minNum(arr));
    }
    static int minNum(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
