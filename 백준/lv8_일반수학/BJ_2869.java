package Coding_test_study.백준.lv8_일반수학;

import java.util.Scanner;

public class BJ_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int day = (v-b)/(a-b);
        if((v-b)%(a-b)!=0) day++; //정상을 지나쳤을경우 내려왔다가 다시 올라가야 하므로 하루 더걸림.
        System.out.println(day);
    }
}
