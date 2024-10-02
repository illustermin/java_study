package method;

public class Method1Ref1 {
    public static void main(String[] args) {
        //계산1
        int sum1= add(5, 10);
        System.out.println(sum1);

        //계산2
       int sum2 = add(15,20);
        System.out.println(sum2);
    }
    //add 메서드
    public static int add(int a, int b){
        System.out.print("a+b 연산수행 ");
        int sum = a+b;
        return sum;
    }
}
