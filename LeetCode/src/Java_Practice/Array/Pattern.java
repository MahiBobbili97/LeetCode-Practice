package Java_Practice.Array;

/*Write a Java program to print the following grid.

        Expected Output :

        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -
        - - - - - - - - - -*/

public class Pattern {
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
