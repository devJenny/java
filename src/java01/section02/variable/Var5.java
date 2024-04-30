package java01.section02.variable;

// 변수 선언과 초기화
public class Var5 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println("a = " + a);

        int b = 2; // 2. 변수 선언과 초기화를 한번에
        System.out.println("b = " + b);

        int c = 3, d = 4; // 3. 여러 변수 선언과 초기화를 한번에
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
