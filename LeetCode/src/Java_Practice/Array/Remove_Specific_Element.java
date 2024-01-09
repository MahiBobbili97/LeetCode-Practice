package Java_Practice.Array;

public class Remove_Specific_Element {
    public static void main(String[] args)
    {
        int[] a={1,23,4,5,11,56};
        int val=23;
        int[] b= new int[a.length-1];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {
                b[count]=a[i];
                count++;
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }


}
