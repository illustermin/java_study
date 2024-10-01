package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 숫자 더하는 프로그램");

        while(true){
            System.out.println("첫번째");
            int num1 = scanner. nextInt();

            System.out.println("두번째");
            int num2 = scanner. nextInt();

            if(num1 == 0 && num2 ==0){
                System.out.println("end");
                break;
            }
            int sum = num1 + num2;
            System.out.println(num1+ num2);

        }

    }

}
