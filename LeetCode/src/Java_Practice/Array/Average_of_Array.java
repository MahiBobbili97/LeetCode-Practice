package Java_Practice.Array;

public class Average_of_Array {
    public static void main(String[] args) {
        int[] array ={1,4,2,5,7,2,6};
        float count=0;
        for(int i=0; i<array.length; i++) {
            count+=array[i];
        }
        count=count/array.length;
        System.out.println(count);
    }
}
