//사이 숫자
// 사용자에게 num1, num2를 입력받고, 두 정수 사이의 모든 정수 출력
// 만약 num1이 num2 보다 크면 두 숫자 교환해서 진행

package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자");
        int num2 = scanner.nextInt();

        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수");
        for(int i=num1; i<=num2; i++){
            System.out.print(i);
            if(i!=num2){
                System.out.print(", ");
            }
        }
    }
}
