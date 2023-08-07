package Coding_test_study.백준.lv9_약수배수소수;

/* 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다. */
import java.util.Scanner;

public class BJ_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 9999999;
        int sum = 0;
        int cnt = 0;
        for(int i=m;i<=n;i++){
            int tmp = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0) tmp++;
            }
            if(tmp==2){
                cnt++;
                sum += i;
                if(min>i) min=i;
            }
        }
        if(cnt==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
