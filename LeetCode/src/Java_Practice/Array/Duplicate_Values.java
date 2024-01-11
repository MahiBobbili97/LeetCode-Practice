package Java_Practice.Array;
import java.util.*;

public class Duplicate_Values {
    public static void main(String[] args)
    {
        int[] a={1,23,4,4,5,11,56};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<a.length; i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0));
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<a.length; i++)
        {
            int count=map.get(a[i]);
            if(count==1)
            {
                list.add(a[i]);
            }
            else
            {
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
        }
        System.out.println(list);

    }
}
