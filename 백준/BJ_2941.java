package Coding_test_study.백준;

import java.util.*;
public class BJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0;i<arr.length;i++){
            s = s.replace(arr[i],"1");
        }
        System.out.println(s.length());
    }
}
