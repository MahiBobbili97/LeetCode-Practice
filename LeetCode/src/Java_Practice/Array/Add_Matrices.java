package Java_Practice.Array;

public class Add_Matrices {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{4, 2, 3}, {8, 5, 6}, {1, 8, 9}};
        int[][] mat3=new int[3][3];
        for (int i =0;i<mat1[0].length;i++) {
            for (int j =0;j<mat2.length;j++) {
                mat3[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for (int i =0;i<mat1[0].length;i++) {
            for (int j =0;j<mat2.length;j++) {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println("");
        }
        if(mat1[0].length!=mat2[0].length&&mat1.length!=mat2.length)
        {
            System.out.println("Matrix addition is not supported");
        }


    }
}
