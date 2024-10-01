//변수값 교환
//변수 a의 값과 변수 b의 값을 서로 바꾸어라.
package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;

        temp = a;
        a=b;
        b= temp;


        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
}
