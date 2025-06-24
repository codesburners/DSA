public class Binary_search_code {
    public static void main(String[] args) {
       // int arr[] ={1,4,6,8,10,13,15,26,45,68,69};
        int arr1[]={81, 27, 25, 12, 11};
        int target=12;
        Binary_search_code b=new Binary_search_code();
        System.out.println(b.Binary(arr1,target));
    }
    public int Binary(int[] arr1,int target)
    {
        int start=0;
        int end=arr1.length-1;
        boolean isDESC=arr1[start]>arr1[end];
        if(isDESC)
        {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target<arr1[mid])
                {
                    start=mid+1;
                } else if (target>arr1[mid]) {

                    end=mid-1;
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
            if(target<arr1[mid])
            {
                end=mid-1;
            } else if (target>arr1[mid]) {

                start=mid+1;
            }
            else{
                return mid;
            }
        }
    }

        return 0;

    }

}
