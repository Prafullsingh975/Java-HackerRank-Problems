import java.util.Scanner;

public class P6_Java_Loop_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int i;
            if (num>=2 && num<=20)
            for (i = 1;i<=10;i++){
                System.out.println(num + " x " + i + " = " +(num * i) );
            }
        }
}
