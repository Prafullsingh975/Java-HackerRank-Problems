import java.util.Scanner;

public class OutputFormating {
    public static void main(String[] args) {
        /*
        Sample Input
java 100
cpp 65
python 50

        Sample Output
================================
java           100
cpp            065
python         050
================================
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s,x);
        }
        System.out.println("================================");
    }
}
