package SWEA_Test.D3;

import java.util.Scanner;

public class TeamHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            System.out.printf("#%d %d\n", tc, sc.nextInt()/3);
        }
    }
}
