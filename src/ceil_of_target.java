public class ceil_of_target {
    public static void main(String[] args) {
        //int arr[] ={1,4,6,8,10,13,15,26,45,68,69};
        int arr[]={81, 27, 25, 12, 11};
        int target=2;
        System.out.println(Ceil(arr,target));
    }
    static int Ceil(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isdesc=arr[start]>arr[end];
        if(isdesc)
        {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid])
                {
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        else{
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid])
                {
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        if(isdesc)
        {
            return end;
        }
        return start;

    }
}
