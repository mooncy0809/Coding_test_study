package Coding_test_study.백준.lv9_약수배수소수;

import java.util.*;

public class BJ_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            int n = sc.nextInt();
            if(n==-1) break;
            for(int i=1;i<n;i++){
                if((n%i)==0){
                    arr.add(i);
                    sum += i;
                }
            }
            if(n!=sum){
                System.out.printf("%d is NOT perfect.\n",n);
            }else {
                for (int i = 0; i < arr.size(); i++) {
                    if (i == 0) {
                        System.out.printf("%d = %d", n, arr.get(i));
                    } else {
                        System.out.printf(" + %d", arr.get(i));
                    }
                }
                System.out.println();
            }
        }
    }
}
