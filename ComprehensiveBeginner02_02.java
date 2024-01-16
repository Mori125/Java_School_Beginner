/**
 * ジャンケンプログラムを作成してください。
 * 1. "ジャンケン"と表示させる
 * 2. "0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
 *    それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
 * 3. 今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
 */

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_02 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            Random rand = new Random();
            int computer_num = rand.nextInt(3);

            String[] hands = {"グー", "チョキ", "パー"};

            if (input == 0 && computer_num == 1 || input == 1 && computer_num == 2 || input == 2 && computer_num == 0) {
                System.out.println("・あなたの手:" + hands[input] + "\n・相手の手:" + hands[computer_num]);
                System.out.println(":あなたの勝ちです");
                break;
            } else if (input == 0 && computer_num == 2 || input == 1 && computer_num == 0 || input == 2 && computer_num == 1) {
                System.out.println("・あなたの手:" + hands[input] + "\n・相手の手:" + hands[computer_num]);                      
                System.out.println("あなたの負けです");
                break;
            } else if (input == 0 && computer_num == 0 || input == 1 && computer_num == 1 || input == 2 && computer_num == 2) {
                System.out.println("・あなたの手:" + hands[input] + "\n・相手の手:" + hands[computer_num]);
                System.out.println("あいこです");
                break;
            } else {
            }
            sc.close();
        }
    }
}