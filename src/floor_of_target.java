public class floor_of_target {
    public static void main(String[] args) {
        int arr[] ={1,4,6,8,10,13,15,26,45,68,69};
        int target=7;
        int[] res= floor(arr,target);
        System.out.println("Value--->"+res[0]+" Index--->"+res[1]);
    }
    static int[] floor(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isdesc=arr[start]>arr[end];
        if (isdesc) {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target>arr[mid])
                {
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }
                else{
                    return new int[] {arr[mid],mid};
                }

            }
        }
        else {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(target<arr[mid])
                {
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
                else{
                    return new int[]{arr[mid],mid};
                }

            }
        }
        if(isdesc)
        {
            return new int[]{arr[start],start};
        }
        else{
            return new int[]{arr[end],end};
        }


    }
}
