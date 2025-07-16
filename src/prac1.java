public class prac1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=1;
        int d=2;
        int end=d-1;
        int temp=0;

        while(start<=end)
        {
            temp=arr[start-1];
            arr[start-1]=arr[start];
            arr[start]=temp;
            start++;
        }
        start=d;end=arr.length-1;
        while(start<=end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;


        }
        start=0;end=arr.length-1;
        while(start<=end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
