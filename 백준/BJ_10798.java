package Coding_test_study.백준;

import java.util.*;

public class BJ_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[5][15];
        for(int i=0;i<5;i++){
            String s = sc.next();
            for(int j=0;j<s.length();j++){
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if (arr[j][i] == '\0') //빈문자열이면 출력하지 않기
                    continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
