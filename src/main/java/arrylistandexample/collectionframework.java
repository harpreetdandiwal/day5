package arrylistandexample;

import java.util.*;

public class collectionframework
{
    public static void main(String[] args) {
        ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("b");
        mStringArrayList.add("c");
        mStringArrayList.add("c");
        mStringArrayList.add("A");
        mStringArrayList.add("A");
       // System.out.println(mStringArrayList);
        int i;
        int size = mStringArrayList.size();
       for (i=0;i<size;i++)
        {
            System.out.println("alphabet  "+mStringArrayList.get(i));
        }
       for (String num: mStringArrayList)
       {
           System.out.println(num);
       }
        Iterator<String> iterator =mStringArrayList.iterator();
       while (iterator.hasNext())
       {
           String s= iterator.next();
           System.out.println(s);
       }
        Set<String> mySet =new HashSet<>();
       mySet.add("punjab");
        mySet.add("canada");
        mySet.add("china");
        mySet.add("india");
        System.out.println(mySet);

        Map<String,String> StringMap =new HashMap<>();
        StringMap.put("pnb ","punjab");
        StringMap.put("cad ","canada");
        StringMap.put("chn ","china");
        StringMap.put("ind ","india");


        System.out.println(StringMap);

        System.out.println(StringMap.get("ind"));
        System.out.println(StringMap.values());

        //when to add provinces

        List<String> canada=new ArrayList<>();
        canada.add("ontario");
        canada.add("manitoba");
        canada.add("british columbia");


        List<String> india =new ArrayList<>();
        india.add("haryana");
        india.add("gujrat");
        india.add("punjab");

        List<String> usa =new ArrayList<>();
        usa.add("new york");
        usa.add("texas");
        usa.add("california");

        Map<String,ArrayList> provinces =new HashMap<>();
        provinces.put("canada",(ArrayList) canada );
        provinces.put("india",(ArrayList) india );
        provinces.put("usa",(ArrayList) usa );
        System.out.println(provinces);

        ArrayList<Integer> myIntegerArray = new ArrayList<>();









    }
}
