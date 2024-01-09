package Java_Practice.Array;

public class Index_of_element {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        int val=5;
        for(int i=0;i<a.length;i++)
        {
            if(val==a[i])
            {
                System.out.println("Element is at "+i);
            }
        }
    }
}
