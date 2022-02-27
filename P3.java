import java.util.Scanner;
/*
Given an integer n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
Constraints
1<=n<=100
 */
public class P3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            if (N<0){
                System.out.println("Invalid input");
            }else{
                if (N % 2 != 0){
                    System.out.println("Weird");
                }else{
                    if (N>=2&&N<=5){
                        System.out.println("Not Weird");
                    }else if(N>=6&&N<=20){
                        System.out.println("Weird");
                    }else if (N>20&&N<=100){
                        System.out.println("Not Weird");
                    }
                }
            }
        }
    }
