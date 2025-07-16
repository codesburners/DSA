import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_prac {
    public static void main(String[] args)throws Exception {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        String s=(String)ht.get(3);
        System.out.println("Value for key 3: " + s);
        ht.compute(2,(k,v)->v+"z");// Modifying value for key 2
        ht.computeIfAbsent(6,(k)->"z"+k);
        /*Enumeration<Integer> e=ht.keys();
        while(e.hasMoreElements())
        {
            System.out.println("Key: " + e.nextElement());
            Thread.sleep(1000); // Sleep for 1 second
        }*/
        System.out.println(ht);
    }
}
