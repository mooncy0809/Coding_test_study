package Coding_test_study.백준.lv11_시간복잡도;

import java.util.Scanner;

public class BJ_242267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((n*(n-1)*(n-2)/6)+"\n" + 3);
    }
}
