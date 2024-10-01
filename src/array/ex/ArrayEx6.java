//가장 작은수 , 큰 수 찾기
// n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은수와 큰 수 찾아 출력

package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수 입력하세요");
        int n = scanner.nextInt();

        int[] numbers = new int[n]; //입력받은 만큼 배열 만들기
        int max, min;

        System.out.println(n+ "개의 정수 입력하세요");
        for(int i=0; i<n; i++){
            numbers[i] = scanner.nextInt();
        }
        min= max = numbers[0]; //min, max 찾기 전에 초기화

        for(int i=1; i<n; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
