
package lev2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>() ;  // 연산 결과 저장할 필드 선택 // list 이름을 result라고 지은거임 그런거임


    public void addresult (double result) {
        results.add(result);
    }
    public List<Double> getList(){
        return results;
//        for(double result : results){ // getlist가 아닌 printlist 함수명을 사용해야 할듯?
//        왜냐하면 getlist는 list를 반환하는 의미인데,
//        향상된 for문에서 사용된 안에 것들은 list의 목록을 출력한다고 봐야하기에 printlist가 함수명 으로 합당해보임.
//            System.out.println(result);
//        }
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

