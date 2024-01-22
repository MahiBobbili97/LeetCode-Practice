package Algorithms.Greedy;

public class Knapsack01 {

    public static void main(String[] args)
    {
        int[] profits={10,5,15,7,6,18,3};
        int[] weights={2,3,5,7,1,4,1};
        int capacity=15;
        Knapsack01 k=new Knapsack01();
        System.out.println(k.Knapsack_solve(profits,weights,capacity));
    }

    public int Knapsack_solve(int[] profits, int[] weights,int capacity)
    {
        int profit=0;
        int[] temp_weights=new int[profits.length];
        for(int i=0;i<profits.length;i++)
        {
            temp_weights[i] = profits[i]/weights[i];
        }
        int max=0;
        int index=0;
        int weight=0;
        while(true)
        {

            for(int i=0;i<temp_weights.length;i++)
            {
                max=Integer.MIN_VALUE;
                if(temp_weights[i]>max)
                {
                    max = temp_weights[i];
                    index=i;
                }
            }
            if(weight>=capacity)
            {
                break;

            }
            else
            {
                profit+=profits[index];
                weight+= weights[index];
                temp_weights[index]=0;
            }


        }

        return profit;
    }
}
