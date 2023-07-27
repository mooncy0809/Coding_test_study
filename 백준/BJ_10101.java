package Coding_test_study.백준;

import java.util.Scanner;

public class BJ_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if (a==60 & b==60 & c==60){
//            System.out.println("Equilateral");
//        } else if ((a+b+c)==180 & (a==b|a==c|b==c)) {
//            System.out.println("Isosceles");
//        } else if ((a+b+c)==180 & (a!=b&a!=c&b!=c)) {
//            System.out.println("Scalene");
//        } else if ((a+b+c)!=180) {
//            System.out.println("Error");
//        }
        //삼항연산자로 풀기
        System.out.println((a == 60 && b == 60 && c == 60) ? "Equilateral"
                : (a + b + c == 180) ? (a == b || b == c || a == c) ? "Isosceles" : "Scalene" : "Error");
    }
}
