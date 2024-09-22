package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&& : and 연산");
        System.out.println(true && true);
        System.out.println(true && false);//false
        System.out.println(false && false);//false


        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true ||false);
        System.out.println(false || false);


        System.out.println("! 연산");
        System.out.println(!true); //false
        System.out.println(!false); //true

    }
}
