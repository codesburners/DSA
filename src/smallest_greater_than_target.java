public class smallest_greater_than_target {
    public static void main(String[] args) {
        char arr[]={'c','d','f','j'};
        char target='j';
        System.out.println(Ceil(arr,target));
    }
    static char Ceil(char[] arr,char target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isdesc=arr[start]>arr[end];


            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target>=arr[mid]){
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }


            }


        return arr[start%arr.length];

    }
}
