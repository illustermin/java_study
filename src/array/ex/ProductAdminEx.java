//상품 관리 프로그램

package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0; //나중에 10개 넘으면 막기


        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료 \n 메뉴를 선택하세요:");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu ==1){
                if(productCount >= maxProducts) {
                    System.out.println("더이상 등록 불가");
                    continue; //10넘으면 다시 while문으로 이동
                }
                System.out.print("상품 이름을 입력하세요");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            }
            else if(menu ==2){
                if(productCount==0){
                    System.out.println("상품 없음");
                    continue;
                }
                for (int i=0; i<productCount; i++){
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            }
            else if(menu ==3){
                System.out.println("프로그램 종료");
                break;
            }
            else{
                System.out.println("다시 선택하세요");
            }


        }
    }
}
