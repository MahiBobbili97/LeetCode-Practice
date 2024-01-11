package Java_Practice.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Common_Elements_Int {

    public static void main(String[] args)
    {
        int[] a={1,2,34,45};
        int[] b={4,5,6,34,34};
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0; i<a.length; i++)
        {
            set.add(a[i]);
        }
        Set<Integer> list=new HashSet<Integer>();
        for(int i=0; i<b.length; i++)
        {
            if(set.contains(b[i]))
            {
                list.add(b[i]);
            }
        }
        System.out.println(list);
    }
}
