package Java_Practice.Array;

import java.util.Arrays;

public class Sort_Numeric_Array {
    public static void main(String[] args)
    {
        int[] arr= {4,2,51,6,35,8,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
