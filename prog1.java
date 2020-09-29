import java.util.Scanner;

public class prog1 {

    public static void main(String args[]) {

        Scanner in  = new Scanner(System.in);
        int numbers ,productOfNumerator=1,productOfDenominator=1,simplestFormOfNumerator,simplestFormOfDenominator;
        System.out.println("enter the number of rational number of rational numbers");
        numbers = in.nextInt();

        int num[] = new int[numbers];
        int den[] = new int[numbers];
        for(int i=0;i<numbers;i++)
        {
            num[i] = in.nextInt();
            den[i] = in.nextInt();
        }

        for(int i =0;i<numbers;i++)
        {
            productOfNumerator = productOfNumerator * num[i];
            productOfDenominator = productOfDenominator* den[i];
        }
        simplestFormOfNumerator= productOfNumerator/(gcd(productOfNumerator,productOfDenominator)); //computing gcd to reduce to its simplest form
        simplestFormOfDenominator = productOfDenominator/(gcd(productOfNumerator,productOfDenominator));
        System.out.println(simplestFormOfNumerator + " " + simplestFormOfDenominator);
    }

    static int gcd(int a,int b) {
        if(a==0)
            return b;
        else if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
