package Coding_test_study.백준;

import java.util.Scanner;

public class BJ_3003 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,8};
        int arr2[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr2[i] = sc.nextInt();
            arr[i] = arr[i] - arr2[i];
        }
        for (int n : arr){
            System.out.print(n+" ");
        }
    }
}
