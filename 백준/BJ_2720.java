package Coding_test_study.백준;

import java.io.*;

/* 거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오.
거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다. */
public class BJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<t;i++){
            int c = Integer.parseInt(br.readLine());
            sb.append(c/q+" ");
            c %= q;
            sb.append(c/d+" ");
            c %= d;
            sb.append(c/n+" ");
            c %= n;
            sb.append(c/p+"\n");
        }
        System.out.println(sb);
    }
}
