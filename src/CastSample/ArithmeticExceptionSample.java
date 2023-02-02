package CastSample;

public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // int型10をint型0で除算
        int a = 10 / 0; // ここで例外が発生!


        // この下は入力されない!!
        System.out.println(a);

    }

}
