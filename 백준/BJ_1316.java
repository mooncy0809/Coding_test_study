package Coding_test_study.백준;

import java.util.*;
public class BJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;  //그룹 단어의 개수
        for (int i = 0; i < n; i++) {
            boolean[] arr = new boolean[26]; //이미 나타난 문자 확인용
            String s = sc.next();
            arr[(int)s.charAt(0) - 97] = true; //우선 첫 단어 확인
            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j); //이전 문자와 같으면 continue
                if (c == s.charAt(j-1)) continue; //이전 문자와 다르고 이미 나타난 문자면 그룹 단어가 아니므로 count - 1
                if (arr[(int)c - 97]) {
                    count--;
                    break;
                }
                arr[(int)c - 97] = true; //나타난 단어라고 확인
            }
        }
        System.out.println(count);
    }
}
