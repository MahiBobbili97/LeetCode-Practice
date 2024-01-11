package Java_Practice.Array;

import java.util.*;

public class Common_Elements_Strings {
    public static void main(String[] args)
    {
        String[] a={"Mahi","Sai","Srinivas"};
        String[] b={"Mahi","Sai","Bobbili"};
        Set<String> set=new HashSet<String>();
        for(int i=0; i<a.length; i++)
        {
            set.add(a[i]);
        }
        List<String> list=new ArrayList<String>();
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
