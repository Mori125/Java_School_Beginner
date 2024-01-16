/**
 * 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）
 * に並んでいるか判定し、小さい順に並んでいる場合はOK、
 * そうなっていない場合はNGと表示するプログラムを作成してください。
 */

import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    
    public static void main(String args[]) {
        System.out.println("小さい順に整数を３つ入力してください");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
         
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        sc.close();
    }
}