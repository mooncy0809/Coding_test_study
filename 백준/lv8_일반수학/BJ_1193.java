package Coding_test_study.백준.lv8_일반수학;

import java.util.Scanner;

public class BJ_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cross_cnt = 1; //대각선
        int sum = 0; //직전 대각선까지의 누적합
        while(true){
            if(x <= sum + cross_cnt){ //x가 해당 대각선 범위 안에 있는 경우
                if(cross_cnt % 2 == 1){
                    //대각선 개수 홀수일 때 순서는 ↙방향 => 분자가 큰 수부터 시작
                    System.out.println(cross_cnt-(x-sum-1)+"/"+(x-sum));
                    break;
                }else{
                    //반대
                    System.out.println((x-sum)+"/"+(cross_cnt-(x-sum-1)));
                    break;
                }
            }else{ //x가 더 큰 대각선 범위에 있는 경우 대각선++
                sum += cross_cnt;
                cross_cnt++;
            }
        }
    }
}
