package Java_Practice.Array;

public class Second_Smallest {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]<min)
            {
                second_min=min;
                min=a[i];
            }
            else if(a[i]<second_min&&second_min!=min)
            {
                second_min=a[i];
            }
        }
        System.out.println(second_min);
    }
}
