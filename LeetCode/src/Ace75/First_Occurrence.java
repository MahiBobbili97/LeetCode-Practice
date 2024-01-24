package Ace75;

public class First_Occurrence {
    public static void main(String args[])
    {
        String haystack = "hello"; String needle = "ll";
        char c=needle.charAt(0);
        int bool=-1;
        for(int i=0; i<haystack.length(); i++)
        {
            if(haystack.charAt(i)==c)
            {
                int count=i;
                for(int j=0; j<needle.length(); j++)
                {
                    if(needle.charAt(j)==haystack.charAt(count))
                    {
                        count++;
                        if(j==needle.length()-1)
                        {
                            bool=i;
                        }
                    }

                }
            }
            if(bool!=Integer.MAX_VALUE)
            {
                break;
            }
        }
        System.out.println(bool);
    }
}
