/**
 * 2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
 * 2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
 */


import java.util.Scanner;

public class ComprehensiveBeginner01_03 {

    public static void main(String args[]) {
        System.out.println("2次方程式 ax^2 + bx + c = 0 の係数a, b, cを入力してください");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.print("２つの実数解");
        } else if (d == 0) {
            System.out.print("重解");
        } else {
            System.out.println("虚数解");
        }

        sc.close();
    }
}
