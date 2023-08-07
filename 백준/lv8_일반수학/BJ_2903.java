package Coding_test_study.백준.lv8_일반수학;

import java.util.*;

public class BJ_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 2;
        for(int i=0;i<n;i++){
            sum += Math.pow(2,i);
        }
        System.out.println((int)Math.pow(sum,2));
    }
}
