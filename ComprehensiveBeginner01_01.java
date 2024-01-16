/**
 * 整数値を入力させ、その値が偶数ならばeven、
 * 奇数ならばoddと表示するプログラムを作成してください。
 */

import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    
    public static void main(String args[]) {
        System.out.println("整数を入力してください");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
}