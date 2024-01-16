/**
 * 以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
 * ・buyDrink() メソッドを持つ、Coffee クラスを使用する
 * ・buyDrink() メソッドを持つ、Juice クラスを使用する
 */

public class ComprehensiveBeginner02_03 {

    public static void main(String[] args) {

        Juice jc = new Juice();
        jc.juiceName = "バヤリース";
        jc.buyDrink();
        jc.juiceName = "午後の紅茶";
        jc.buyDrink();

        Coffee cf = new Coffee();
        cf.coffeeName = "ボス";
        cf.buyDrink();
        cf.coffeeName = "ジョージア";
        cf.buyDrink();
        
    }
}

class Juice {

    String juiceName;
    String juiceTaste;
    int juicePrice;
    
    public void buyDrink() {

        switch (juiceName) {
            case "バヤリース":
                juiceTaste = "オレンジ";
                juicePrice = 130;
                break;
            case "午後の紅茶":
                juiceTaste = "レモンティー";
                juicePrice = 150;
                break;
            default:
                System.out.println("？");
        }
        System.out.println(juiceName + " の " + juiceTaste + " 味です。" + juicePrice + " 円になります。");
    }
}

class Coffee {

    String coffeeName;
    String coffeeTaste;  
    int coffeePrice;

    public void buyDrink() {
   
        switch (coffeeName) {
            case "ボス":
                coffeeTaste = "控えめ、ミルク 無し";
                coffeePrice = 110;
                break;
            case "ジョージア":
                coffeeTaste = "甘め、 ミルク 入り";
                coffeePrice = 120;
                break;
            default:
                System.out.println("？");
        }
        System.out.println(coffeeName + " の甘さは " + coffeeTaste + "です。" + coffeePrice + " 円になります。");
    }
}