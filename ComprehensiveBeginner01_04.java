/**
 * とある美術館の入場料金は、一人600円であるが、
 * 5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
 * 人数を入力し、入場料の合計を計算するプログラムを作成してください。
 */

import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    
    public static void main(String[] args) {
        System.out.println("人数を入力してください");

        Scanner sc = new Scanner(System.in);
        int human = sc.nextInt();
        
        int nyuujou1 = 600;
        int nyuujou2 = 550;
        int nyuujou3 = 500;
        int price = 0;
        
        if (human < 5) {
            price = human*nyuujou1;
        }else if (human < 20) {
            price = human*nyuujou2;
        }else {
            price = human*nyuujou3;
        }

        System.out.println("入場料は" +  price + "円です");
        sc.close();
    }
}
