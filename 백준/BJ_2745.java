package Coding_test_study.백준;

import java.util.Scanner;

/* B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
Ex) 36진수 ZZZZZ를 10진법으로 => 35x(36**4)+35x(36**3)+35x(36***2)+35x(36**1)+35x(36**0) = 60466175 */
public class BJ_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String N = sc.next();
//        int B = sc.nextInt(); //B진법 수 N을 10진법으로 출력
//        int result = 0;
//        for(int i=0;i<N.length();i++){
//            int val = N.charAt(N.length()-i-1)-55; //뒷자리부터,아스키코드에서 'A' = 65 이므로 -55
//            if(val<10){
//                val += 7; //10미만의 자연수는 48을 빼줘야 1~9가 되므로 +7
//            }result += val*Math.pow(B,i);
//        }
//        System.out.println(result);
        System.out.print(Integer.parseInt(sc.next(), sc.nextInt())); //위의 모든것이 요 한줄이면 해-결
    }
}
