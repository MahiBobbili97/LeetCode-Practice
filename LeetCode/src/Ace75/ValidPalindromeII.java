package Ace75;

import java.util.HashMap;
import java.util.Map;

public class ValidPalindromeII {
    public static void main(String args[])
    {
        String s="abdca";
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int[] count = {0};
        map.forEach((key, value) -> {
            if (value % 2 != 0) {
                count[0]++;
            }
        });
        if(count[0]>2)
        {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}
