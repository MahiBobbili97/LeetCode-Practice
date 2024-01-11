package Java_Practice.Array;

public class Second_Largest {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                second_max=max;
                max=a[i];
            }
        }
        System.out.println(second_max);
    }
}
