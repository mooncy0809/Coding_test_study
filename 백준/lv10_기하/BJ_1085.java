package Coding_test_study.백준.lv10_기하;

import java.util.Scanner;

public class BJ_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min = 1000;

        if(min > x) min = x;
        if(min > y) min = y;
        if(min > (w-x)) min = w-x;
        if(min > (h-y)) min = h-y;

        System.out.println(min);

    }
}
