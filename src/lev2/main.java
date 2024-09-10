package lev2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();  // 객체 생성

        while (true) {
            System.out.println("첫 번째 숫자를 입력 : ");
            double num1 = sc.nextDouble();
            System.out.println("두 번째 숫자를 입력 : ");
            double num2 = sc.nextDouble();

            System.out.println("사칙연산 입력 : ");
            String operator = sc.next();

            double result = calculator.caclulate(operator, num1, num2);
            System.out.println("결과: " + result);

            System.out.println("지금까지의 결과값:");
            calculator.getList();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            String input = sc.nextLine();
            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }


    }
}
