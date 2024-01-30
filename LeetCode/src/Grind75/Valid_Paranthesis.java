package Grind75;

import java.util.Stack;

public class Valid_Paranthesis {
    public static void main(String[] args)
    {
        String s="[()";
        Valid_Paranthesis a=new Valid_Paranthesis();
        System.out.println(a.getValid_Paranthesis(s));
    }
    public boolean getValid_Paranthesis(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            if(c  == '('||c  == '{' ||c  == '[')
            {
                stack.push(c);
            }
            else if(!stack.isEmpty()&& (c == '}' && stack.peek() == '{' || c == ')' && stack.peek() == '(' || c == ']' && stack.peek() == '[')) {

                    stack.pop();

            }
             else
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
