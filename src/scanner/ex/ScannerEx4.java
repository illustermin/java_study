//구구단 출력
//하나의 정수 n 을 입력받고, 입력받은 정수 n 의 구구단을 출력하는 프로그램을 작성

package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해주세요");
        int num = input.nextInt();

        System.out.println(num+"단의 구구단");
        for(int i=1; i<=9; i++){
            System.out.println(num + "*" +i +"=" + num*i);
        }
    }

}
