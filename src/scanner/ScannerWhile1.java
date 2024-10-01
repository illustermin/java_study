//입력받은 문자가 "exit"이면 프로그램 종료

package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("문자열 입력하세요");
            String str = scanner.nextLine();

            if(str.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println(str);
        }
    }
}
