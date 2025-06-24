import java.sql.SQLOutput;

public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean found=false;
        for(char ch='a';ch<='z';ch++)
        {
            if(sentence.contains(String.valueOf(ch)))
            {
                found=true;
            }
            else
            {
                found=false;
                break;
            }

        }
        System.out.println("Is the sentence a pangram? " + found);
    }
}
