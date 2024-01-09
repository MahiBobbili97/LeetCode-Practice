package Java_Practice.Array;

public class Max_Min {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Max: "+max+", min: "+min);
    }
}
