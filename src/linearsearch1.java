public class linearsearch1 {
    public static void main(String[] args) {
        String name="Gowtham";
        char target='m';
        boolean result = search(name, target);
        System.out.println("Is the character '" + target + "' present in the string? " + result);


    }
    static boolean search(String str,char target)
    {
        if(str.length()==0){
            return false;
        }
        else{
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
