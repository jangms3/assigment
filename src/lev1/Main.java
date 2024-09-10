package lev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // 양의 정수2개 입력하기
            System.out.println("첫 번째 숫자를 입력하세요");
            double num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요");
            double num2 = sc.nextInt();


            // 사칙연산 기호 입력 받기
            System.out.print("사칙연산 입력: ");
            String operator = sc.next();

            // 결과값 변수 선언
            double result = 0;
            boolean isValid = true; // 연산의 유효성을 체크하기 위한 변수

            // switch 또는 if 문을 사용하여 연산 처리
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                        isValid = false; // 연산이 유효하지 않음을 표시
                    }
                    break;
                default:
                    System.out.println("오류: 잘못된 연산자입니다.");
                    isValid = false; // 유효하지 않은 연산자일 경우
            }

            // 연산이 유효한 경우에만 결과 출력
            if (isValid) {
                System.out.println("결과: " + result);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            String input = sc.nextLine();
            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}