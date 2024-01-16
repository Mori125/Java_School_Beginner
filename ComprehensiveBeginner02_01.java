/**
 * スロットマシーンプログラムを作成してください。
 * 1. "ゾロ目で大当たり！チャンスは30回"と表示させる
 * 2. "begin と入力してください> " と入力すると、開始するようにする
 * 3. ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
 * 4. 大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
 * 5. 30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
 */

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ゾロ目で大当たり！チャンスは30回");
            System.out.println("begin と入力してください> ");
            String scan = sc.nextLine();

            if (scan.equals("begin")) {
                break;
            }
            System.out.println("もう一度入力してください");    
        }
        sc.close();
        slotGame();
    }
    
    private static void slotGame() {

        for (int i = 1; i <= 30; i++) {
            
            int a = new Random().nextInt(10);
            int b = new Random().nextInt(10);
            int c = new Random().nextInt(10);

            // ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
            System.out.println(i + "回目:" + a + b + c);  
            
            // 大当たり(ゾロ目)の場合
            if (a == b && b == c) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                break;
            }
            // 30回のうちに大当たりが出なかった場合
            if (i == 30) {
                System.out.println("残念でした。終わります。");
            } 
        }          
    }       
}
    