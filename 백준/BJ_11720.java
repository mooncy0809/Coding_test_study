package Coding_test_study.백준;
/*N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.*/
import java.util.*;
public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i=0;i<n;i++){
            char c = num.charAt(i);
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}
