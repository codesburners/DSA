public class rotated_binary_search {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,4};
        int target=0;
        System.out.println("Pivot index: " + search(arr,target));
    }
    static  int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        // if pivot is not found, the array is not rotated
        if(pivot==-1)
        {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if pivot is found, we have 2 sorted arrays
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }else{
            return binarySearch(nums, target, pivot + 1, nums.length - 1);

        }

    }
    static int binarySearch(int[] arr1,int target,int start,int end) {

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
        return -1; // target not found
    }
    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            // 4 cases
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1; // pivot not found, array is not rotated
    }
}
