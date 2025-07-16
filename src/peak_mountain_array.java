public class peak_mountain_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,6,3,2};
        int peakIndex = peakIndex(arr);
        System.out.println("Peak index is: " + peakIndex);
    }
    static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return arr[start]; // or end, both will be the peak index
    }
}
