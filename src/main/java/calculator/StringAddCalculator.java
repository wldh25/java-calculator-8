package calculator;

import calculator.parser.InputParser;
import calculator.validator.InputValidator;

public class StringAddCalculator {
    private StringAddCalculator() { }
    public static int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0; // 빈 문자열은 0 출력
        }
        
        // 기본 구분자로 분리
        String[] tokens = InputParser.splitByDefault(input);
        
        // 검증
        InputValidator.validateTokens(tokens);
        
        // 합치기
        long sum = 0L;
        for(String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return (int) sum;
    }
}
