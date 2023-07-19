package Coding_test_study.백준;

/*알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.*/
import java.util.*;
public class BJ_10809 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int intarr[] = new int[arr.length];
        Arrays.fill(intarr, -1);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==s.charAt(i)){
                    intarr[j]=i;
                }
            }
        }
        for(int n:intarr){
            System.out.print(n+" ");
        }
    }
}
