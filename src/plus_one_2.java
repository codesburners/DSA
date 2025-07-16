public class plus_one_2 {
    public static void main(String[] args) {
        int[] dig={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
       for(int i=dig.length-1;i>=0;i--)
       {
           if(dig[i]<9)
           {
               dig[i]++;
               printArray(dig);
                return;
           }
           dig[i]=0;
       }
       if(dig[0]==0)
       {
           int[] temp=new int[dig.length+1];
              temp[0]=1;
              temp=dig;
       }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
