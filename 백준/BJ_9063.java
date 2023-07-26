package Coding_test_study.백준;

import java.util.*;

public class BJ_9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> xrr = new ArrayList<>();
        ArrayList<Integer> yrr = new ArrayList<>();
        int n = sc.nextInt();
        int x,y;
        if(n==1){
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(0);
        }
        else {
            for (int i = 0; i < n; i++) {
                x = sc.nextInt();
                y = sc.nextInt();
                xrr.add(x);
                yrr.add(y);
            }
            int min_x = Collections.min(xrr);
            int max_x = Collections.max(xrr);
            int min_y = Collections.min(yrr);
            int max_y = Collections.max(yrr);
            System.out.println((max_x-min_x)*(max_y-min_y));
        }



    }
}
