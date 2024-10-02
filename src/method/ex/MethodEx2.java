package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {

        Message("Hello, world!", 3);
        Message("Hello, world!", 5);
        Message("Hello, world!", 7);

    }
    public static void Message(String message,int times){
        for(int i=0; i< times; i++){
            System.out.println(message);
        }
    }
}
