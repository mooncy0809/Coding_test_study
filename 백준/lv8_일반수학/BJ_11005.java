package Coding_test_study.백준.lv8_일반수학;

import java.util.*;

public class BJ_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        //방법1
        //System.out.println(Integer.toString(N,B).toUpperCase());

        //방법2
        List<Character> list = new ArrayList<>();
        while(N>0) {
            if(N%B<10)
                list.add((char)(N%B+'0')); // 9이하는 아스키코드값 0을 더해줌으로써 a%b의 값을 아스키코드로 char형 list에 저장
            else
                list.add((char)(N%B-10+'A')); //10부터 A이므로 나머지 값에서 10을 빼고 아스키코드 값  'A'를 더해줌으로써 A~Z까지 알파벳으로 저장
            N = N/B;
        }
        for(int i=list.size()-1; i>=0; i--)
            System.out.print(list.get(i));

    }
}
