package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.println("입력하세요");
            int number = input.nextInt();

            if(number ==0){
                break;
            }
            sum+=number;
        }
        System.out.println("result: "+ sum);

    }
}
