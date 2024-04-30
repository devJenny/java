package java01.section02.variable;

// 변수 타입2
public class Var8 {
    public static void main(String[] args) {
        /*
         정수는 int를 기본으로, 실수는 double을 기본으로 사용함
         byte, short, float, char은 실무에서는 거의 사용하지 않음
         */
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,965,886,807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;
        double d = 10.0;

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }
}
