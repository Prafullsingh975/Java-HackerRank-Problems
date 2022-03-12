import java.util.Scanner;

public class Java_Loop_2 {
    public static void main(String[] args) {
        /*
        We use the integers a, b, and n to create the following series:
(a+2^0*b), (a+2^0*b+2^1*b).......(a+2^0*b+2^1*b......+2^n-1*b)

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

Input Format :-
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.

Constraints :-
0 <= q <= 500
0 <= a,b <= 50
1 <= n <= 15
Output Format :-
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
Sample Input :
2
0 2 10
5 3 5
Sample Output :
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation :-
We have two queries:
We use a=0, b=2, and n=10 to produce some series S0, S1..., Sn-1:
S0 = 0 + 1*2 = 2
S1 = 0 + 1*2 + 2*2 = 6
S2 = 0 + 1*2 + 2*2 + 4*2 = 14
... and so on.
Once we hit n=10, we print the first ten terms as a single line of space-separated integers.

2. We use a = 5, b = 3, and n = 5 to produce some series S0, S1, ..., Sn-1:
S0 = 5 +1.3= 8
S1 = 5 + 1*3 + 2*3 = 14
S2 = 5 + 1*3 + 2*3 + 4*3 = 26
S3 = 5 + 1*3 +2*3 + 4*3 + 8*3 = 50
S4 = 5 + 1*3 + 2*3 + 4*3 + 8*3 + 16*3 = 98
We then print each element of our series as a single line of space-separated values.

Solution :-
         */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0;i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0;j<n;j++){
                a += b*Math.pow(2,j);
                System.out.print(a +" ");
            }
        System.out.println();
        }
    }
}