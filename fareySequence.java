import java.util.Scanner;

public class fareySequence {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.printf("enter the value of n");
        int n = in.nextInt();
        System.out.println(farey(n));
    }

    static StringBuffer farey(int n) {
        double x1 = 0, y1 = 1, x2 = 1, y2 = n;
        StringBuffer seq = new StringBuffer();
        seq.append("0/1 1/");
        seq.append((int)y2 + " ");
        double x, y = 0;
        while (y != 1.0)
        {

            final var floor = Math.floor((y1 + n) / y2);
            x = floor * x2 - x1;
            y = floor * y2 - y1;

            seq.append((int)x + "/");
            seq.append((int)y+" " );

            x1 = x2;
            x2 = x;
            y1 = y2;
            y2 = y;
        }
        return seq;
    }
}
