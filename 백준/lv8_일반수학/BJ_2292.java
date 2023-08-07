package Coding_test_study.백준.lv8_일반수학;

import java.util.Scanner;
//벌집
public class BJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1; //1이여도 최소 1개의 방 지남
        int range = 2; //2부터 두번째 방

        if(n==1){
            System.out.println(1);
        }else{
            while(range<=n){
                range += (cnt*6); //6씩 커지면서 다음방
                cnt++;
            }
            System.out.println(cnt);
        }



    }
}
