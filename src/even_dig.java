public class even_dig {
    public static void main(String[] args) {
        int [] arr = {1,22,3,4};
        System.out.println("Count of numbers with even digits: " + hasEvenDigits(arr));
    }
    static int hasEvenDigits(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(String.valueOf(arr[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
