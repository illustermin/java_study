//사용자로부터 입력받은 이름과 나이 출력

package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 이름은?");
        String name = scanner.nextLine();

        System.out.println("당신의 나이는?");
        String age = scanner.nextLine();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }

}
