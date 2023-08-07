package Coding_test_study.백준.lv7_2차원배열;

import java.util.Scanner;

public class BJ_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max = 0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(arr[i][j] == max){
                    System.out.println(arr[i][j]);
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }
    }
}
