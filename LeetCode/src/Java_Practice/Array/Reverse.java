package Java_Practice.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        Integer[] b=Arrays.stream(a).boxed().toArray(Integer[]::new);
        List<Integer> list= Arrays.asList(b);
        Collections.reverse(list);
        Integer[] c=list.toArray(new Integer[0]);
        for(int i=0; i<c.length; i++)
        {
            System.out.println(" " + c[i]);
        }

    }
}
