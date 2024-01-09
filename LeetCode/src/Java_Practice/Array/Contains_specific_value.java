package Java_Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contains_specific_value {
    public static void main(String[] args) {
        int[] array = {1,3,4,6,7,9};
        int val=4;
        List<Integer> ls = Arrays.stream(array).boxed().toList();
        if(ls.contains(val))
        {
            System.out.println("Contains_specific_value");
        }
        else {
            System.out.println("Doesn't contain specific value");
        }
        
    }
}
