import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class dimensionChange {

    public static void print2D(int mat[][])
    {
        // Loop through all rows
        StringBuffer arr = new StringBuffer();
        for (int[] row : mat)
        arr.append(Arrays.toString(row));
        for(int i=0;i<arr.length();i++)
        {
            if(( arr.charAt(i)==']') && (i!=0 && i!=arr.length()-1)) {
                arr.deleteCharAt(i);
                arr.deleteCharAt(i);
                arr.insert(i,",");
                arr.insert(i," ");
            }
        }
        System.out.println(arr);
    }

    public static void main(String args[]) throws IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = in.nextInt();
        print2D(mat);
    }
}
