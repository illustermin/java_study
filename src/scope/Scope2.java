package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m=10;
        for(int i=0; i<2; i++){
            System.out.println("if m = " + m);
            System.out.println("if i = " + i);
        }//i 생존종료

        System.out.println("main m= "+ m);
    }
}
