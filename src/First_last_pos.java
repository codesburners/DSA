public class First_last_pos {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,8,8,10};
        int target=8;
        int[] ans=search(arr,target);
        System.out.println("First Position: " + ans[0]);
        System.out.println("Last Position: " + ans[1]);

    }
    static int[] search(int[] arr,int target){
        int[] ans=new int[2];
        ans[0]=first(arr,target,true);
        ans[1]=first(arr,target,false);
        return ans;
    }
    static int first(int[] arr, int target, boolean firstRange){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
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
                ans=mid;
                if(firstRange) {
                    end = mid - 1; // search in left part
                } else {
                    start = mid + 1; // search in right part
                }

            }
        }
        return ans;
    }
}
