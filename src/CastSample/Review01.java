package CastSample;

public class Review01 {

    public static void main(String[] args) {
      //変数に１５００を代入//;
        int num1 = 1500;
      //変数に税率を代入//;
        int num2 = 10;
        //変数を定義//;
        int result;
        //resultにtaxMethoodの結果を代入(戻り値）//
        result = taxMethod(num1, num2) ;

        System.out.println(num1 + "円の商品の税込価格は" + (num1 + result)
        + "円（消費税は" + result + "円）です。");

        }
        public static int taxMethod(int num1, int num2) {

        int result = (int) (num1 * (int)num2 / (1000 * 0.1)) ; /*消費税算出*/
        return result; //
        }
        }
