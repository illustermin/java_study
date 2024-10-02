package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("동작");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("start");
        return;
    }
    public static void printFooter(){
        System.out.println("end");
        return;
    }
}
