package Coding_test_study.백준;

/* Q3009 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오. */
import java.util.*;

public class BJ_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xrr = new int[1001];
        int[] yrr = new int[1001];
        Arrays.fill(xrr,0);
        Arrays.fill(yrr,0);
        int result_x=0, result_y=0;
        for(int i=0;i<3;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            xrr[x]++;
            yrr[y]++;
        }
        for(int i=1;i<=1000;i++){
            if(xrr[i]%2 != 0) result_x=i;
            if(yrr[i]%2 != 0) result_y=i;
        }
        System.out.println(result_x+" "+result_y);
        /* 다른풀이 XOR연산
        * Scanner sc = new Scanner(System.in);
                int x = 0, y = 0;
                for (int i = 0; i < 3; i++) {
                    x = x ^ sc.nextInt();
                    y = y ^ sc.nextInt();
                }
                System.out.print(x + " " + y);
                sc.close();
        * */

    }
}
