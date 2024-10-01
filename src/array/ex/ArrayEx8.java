// 2차원 배열 2
//4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균 계산
//ArrayEx7에서 학생수를 입력받도록 개선

package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요");
        int student = scanner.nextInt();

        int[][] scores = new int[student][3];
        String[] subjects = {"국어", "수학", "영어"};

        for(int i=0; i<student; i++){
            System.out.println((i+1)+ "번 학생의 성적을 입력하세요");
            for(int j=0; j<3; j++){
                System.out.print(subjects[j] + "점수");
                scores[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<student; i++){
            int sum =0;
            for(int j=0; j<3; j++){
                sum += scores[i][j];
            }
            double average = sum/3.0;
            System.out.println((i+1)+ "번 학생의 총점: " + sum + ", 평균:" + average);

        }

    }
}
