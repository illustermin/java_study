//배열과 역순 출력
//5개의 정수를 입력받아서 배열에 저장하고, 순서의 반대인 역순으로 출력
package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[5];

            System.out.println("5개의 정수 입력");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("출력");
            for (int i = 4; i >=0 ; i--) {
                System.out.print(numbers[i]);
                if (i >0 ) {
                    System.out.print(", ");
                }
            }

        }
    }

