package Solved;

import java.util.Scanner;

public class P8958{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            int bonus = 0;
            int score = 0;
            for (int j = 0; j < s.length(); j ++) {
                if (s.charAt(j) == 'O')
                    score += ++bonus;
                else
                    bonus = 0;
            }
            System.out.println(score);
        }
    }

}