package linkedHashset_prac;
import java.util.*;
public class linkedHashset_prac {
    public static void main(String[] args)throws Exception {
        HashSet<String>lhs=new HashSet<>();
        lhs.add("apple");
        lhs.add("banana");
        lhs.add("cherry");
        lhs.add("date");
        lhs.add("elderberry");
        lhs.add("fig");
        lhs.add("grape");
        lhs.add("apple"); // Duplicate, will not be added
//        lhs.forEach((x)-> System.out.println(x));
//        System.out.println("Size of LinkedHashSet: " + lhs.size());
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            Thread.sleep(1000); // Sleep for 1 second
            System.out.println(element);
        }

    }
}
