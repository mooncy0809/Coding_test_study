package Coding_test_study.백준;

import java.util.Scanner;

public class BJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int cnt = 0;
            for(int j=1;j<=a;j++){
                if(a%j==0) cnt++;
            }
            if(cnt==2) result++;
        }
        System.out.println(result);
    }
}
