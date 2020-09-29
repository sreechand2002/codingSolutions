import java.util.Scanner;

public class sumOfIndices {
    public static void main(String args[]) {
        int num;
        System.out.println("Enter a number ");
        Scanner in  = new Scanner(System.in);
        num = in.nextInt();
        int sm = sum(num);
        System.out.println(sm);
    }

    static int sum(int num) {
        int index=0,sum=0;
        StringBuffer bin = new StringBuffer("");
        while(num > 0) {
            bin.append(num % 2);
            num = num / 2;
        }
        for(int i =0;i<bin.length();i++) {
            if(bin.charAt(i)=='1') {
                sum  =sum +i+1;
            }
        }
        return sum;
    }
}
