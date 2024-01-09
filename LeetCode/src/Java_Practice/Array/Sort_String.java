package Java_Practice.Array;


import java.util.Arrays;

public class Sort_String {
    public static void main(String[] args) {
        String str="mahi";
        char[] c=str.toCharArray();
        Arrays.sort(c);
        String str2=new String(c);
        System.out.println(str2);

    }
}
