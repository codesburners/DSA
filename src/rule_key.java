import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rule_key {
    public static void main(String[] args) {
        List<List<String>> listOfList=new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        listOfList.add(list1);
        listOfList.add(Arrays.asList("computer", "silver", "lenovo"));
        listOfList.add(Arrays.asList("phone", "silver", "iphone"));
       String  ruleKey = "color", ruleValue = "silver";
       int count1=0;
       int count2=0;int count3=0;
       for(int i=0;i< listOfList.size();i++)
       {
           List<String> list=new ArrayList<>();
           if(ruleKey.equals("type")&&listOfList.get(i).get(0).equals(ruleValue)){
                count1++;
              }
              else if(ruleKey.equals("color")&&listOfList.get(i).get(1).equals(ruleValue)){
               count2++;
              }
              else if(ruleKey.equals("name")&&listOfList.get(i).get(2).equals(ruleValue)){
               count3++;
           }
       }
       if(ruleKey.equals("type")) {
           System.out.println(count1);
       } else if (ruleKey.equals("color")) {
           System.out.println(count2);
       } else if (ruleKey.equals("name")) {
           System.out.println(count3);
       }

    }
}

