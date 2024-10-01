//scope: 변수의 접근 가능한 범위
package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if(true){
            int x=20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }//x 생존 종료

    }//m 생존 종료
}
