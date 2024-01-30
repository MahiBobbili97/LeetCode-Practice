package Grind75;
import java.util.*;
public class Two_Sum {
    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int target = 9;
        Two_Sum a=new Two_Sum();
        a.get_Two_Sum(nums,target);

    }

    public int[] get_Two_Sum(int[] nums, int target)
    {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                int[] result={map.get(target-nums[i]),i};
                return result;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return null;

    }
}
