package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        // 예외 발생 시 프로그램이 종료되도록 처리
        try {
            int result = StringAddCalculator.add(input);
            System.out.println("결과 : " + result);
        } catch (IllegalArgumentException e) {
            // 별도 메세지 출력 없이 바로 종료
        }
    }
}
