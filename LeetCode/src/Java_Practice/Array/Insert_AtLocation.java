package Java_Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert_AtLocation {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        int val=2;
        int index=3;
        ArrayList<Integer> list= new ArrayList<>(Arrays.stream(a).boxed().toList());
        list.add(index,val);
        System.out.println(list);
    }
}
