package array;

public class EnhanceFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
            //numbers에서 하나씩 꺼내서 넣고 실행하는 방법
        for (int number : numbers) {
            System.out.println(number);
        }





    }
}
