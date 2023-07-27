package Coding_test_study.백준;

import java.util.*;

public class BJ_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);

        while((arr[0]+arr[1])<=arr[2]){
            arr[2]--;
        }
        System.out.println(Arrays.stream(arr).sum());
    }
}
