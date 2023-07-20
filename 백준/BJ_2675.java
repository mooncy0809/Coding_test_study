package Coding_test_study.백준;

import java.util.Scanner;

/*문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고,
두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.*/
public class BJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            int r = sc.nextInt();
            String s = sc.next();
            String p = "";
            for(int i=0;i<s.length();i++){
                for(int j=0;j<r;j++) {
                    p += String.valueOf(s.charAt(i));
                }
            }
            System.out.println(p);
        }

        Scanner s=new Scanner(System.in);

/*        for(int i=s.nextInt();i>0;i--) {
            int n=s.nextInt();
            String a=s.next();
            for(char k:a.toCharArray())
                System.out.print((k+"").repeat(n)); //java11부터 사용가능
            System.out.println();
        }*/
    }
}
