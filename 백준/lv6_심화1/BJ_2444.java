package Coding_test_study.백준.lv6_심화1;

//별찍기
import java.util.*;
public class BJ_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            String s = "";
            for(int j=n-1; j>=i; j--) {
                s += " ";
            }
            for(int k=1; k<=2*i-1; k++) {
                s += "*";
            }
            System.out.println(s);
        }
        for(int i=n-1; i>0; i--) {
            String s = "";
            for(int j=n-1; j>=i; j--) {
                s += " ";
            }
            for(int k=1; k<=2*i-1; k++) {
                s += "*";
            }
            System.out.println(s);
        }    }
}
