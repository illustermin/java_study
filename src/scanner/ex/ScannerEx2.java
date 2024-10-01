//사용자로부터 하나의 정수를 입력받고, 홀수인지 짝수인지 판별
package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("입력한 숫자" + num + "은 짝수입니다.");
        }else{
            System.out.println("입력한 숫자" + num + "은 홀수입니다.");
        }
    }
}
