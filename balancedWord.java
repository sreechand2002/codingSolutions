import java.util.Scanner;

public class balancedWord {

    public static void main(String args[]) {
        Scanner in  = new Scanner(System.in);
        String word ;
        System.out.println("Enter a word");
        word = in.next();
        boolean res = bWord(word);
        System.out.println(res);
    }

    static boolean  bWord(String word) {
        int i,j,rsum=0,lsum=0;
        if(word.length()%2==0)
            for(i=0,j=word.length()-1;i<word.length()/2 &&j>=word.length()/2;i++,j--) {
            rsum = (rsum+(int)word.charAt(j))-96;
            lsum = (lsum+(int)word.charAt(i))-96;
        }
        else if(word.length()%2!=0)
            for(i=0,j=word.length()-1;i<word.length()/2 &&j>word.length()/2;i++,j--) {
            rsum = (rsum+(int)word.charAt(j))-96;
            lsum = (lsum+(int)word.charAt(i))-96;
        }
        System.out.println(rsum);
        System.out.println(lsum);
        return (rsum == lsum);
    }
}
