package Coding_test_study.백준;

import java.util.Scanner;

public class BJ_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[][] = new int[100][100];
        for(int n=0;n<t;n++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=x;i<x+10;i++){
                for(int j=y;j<y+10;j++){
                    arr[i][j] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j]==1) cnt++;
            }
        }System.out.println(cnt);
    }
}
