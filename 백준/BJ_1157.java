package Coding_test_study.백준;

import java.util.*;
public class BJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int arr[] = new int[100];
        int max = 0;
        int maxac = 0;
        int maxcnt = 0;
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            int ac = (int)s.charAt(i);
            arr[ac]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                maxac = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                maxcnt++;
            }
        }
        if(maxcnt>=2){
            System.out.println("?");
        }else{
            System.out.println((char)maxac);
        }

        /* 숏코딩
        Scanner sc=new Scanner(System.in);
		String s=sc.next().toUpperCase();
		sc.close();
		int a[]=new int[26], max=-1; char c='?';
		for(int i=0;i<s.length();i++) {
			int j=s.charAt(i)-'A';
			a[j]++;
			if(a[j]>max) {max=a[j]; c=(char)(j+'A');}
			else if(a[j]==max) c='?';
		}
		System.out.println(c);*/
    }
}
