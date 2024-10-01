//합계와 평균
//5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램 작성
//ArrayEx4와 다른 점은 입력받을 숫자의 개수를 입력받도록 개선

package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수 입력하세요");
        int count = scanner.nextInt();

        int[] numbers = new int [count];
        int sum=0;
        double average;

        System.out.println(count+"개의 정수 입력");
        for(int i=0; i<count; i++){
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }
        average = (double) sum/count;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
