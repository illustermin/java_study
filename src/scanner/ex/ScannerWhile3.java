//입력한 숫자의 합계와 평균
//여러 개의 숫자 입력 받고, 합계와 평균 계산하는 프로그램
//마지막에는 -1을 입력하여 숫자 입력이 종료한다고 가정
//합계 sum, 평균 average, 평균은 소수점 아래까지 계산
package scanner.ex;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum= 0;
        int count=0;
        int input=0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력");

        while (true){
            input = scanner.nextInt();
            if(input == -1){
                break;
            }
            sum+=input;
            count++;
        }
        double average = (double)sum/count;
        System.out.println("합계: " +sum);
        System.out.println("평균: " +average);

    }
}
