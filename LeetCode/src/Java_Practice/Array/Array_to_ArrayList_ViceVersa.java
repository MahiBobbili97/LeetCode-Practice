package Java_Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList_ViceVersa {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        Integer[] integerArray = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            integerArray[i] = a[i];
        }
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(integerArray));
        System.out.println(list);
        int b[]=list.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
