//상품구매
//상품정보(상품명, 가격, 수량)을 입력받고, 총 가격을 출력하는 프로그램
//
package scanner.ex;

import java.util.Scanner;

public class ScannerWhile4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost =0;

        while(true){
            System.out.println("1.상품 입력, 2:결제, 3:프로그램 종료");
            int option = input.nextInt();

            if(option==1){
                 input.nextLine();

                System.out.println("상품명 입력하세요");
                String product = input.nextLine();

                System.out.println("상품 가격 입력하세요");
                int price = input.nextInt();

                System.out.println("구매 수량 입력하세요");
                int quantity = input.nextInt();

                totalCost += price * quantity; //상품 추가할 때마다 누적
                System.out.println("상품명"+ product + "가격" + price+"수량:"+quantity + "합계"+ quantity*price);

            }else if(option==2){
                System.out.println(totalCost);
                totalCost =0;

            }else if(option==3){
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println("다시 선택하세요.");
            }
        }

    }
}
