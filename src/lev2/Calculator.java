
package lev2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>() ;  // 연산 결과 저장할 필드 선택


    public void addresult (double result) {
        results.add(result);
    }
    public void getList(){
        for(double result : results){
            System.out.println(result);
        }
    }

    // 사칙연산 수행 메서드
    public double caclulate(String operator, double num1, double num2){
        double result = 0;
        boolean isValid = true;

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
        if (isValid){
            results.add(result);
        }

        return result;
    }
}

