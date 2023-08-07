package Coding_test_study.백준.lv10_기하;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        while (true){
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);

            if(arr[0]==0 && arr[1]==0 && arr[2]==0) break;

            if(arr[0]+arr[1] <= arr[2]){
                System.out.println("Invalid");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }

        }
    }
}
