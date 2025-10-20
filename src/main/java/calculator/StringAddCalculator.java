package calculator;

import calculator.parser.InputParser;
import calculator.validator.InputValidator;

public class StringAddCalculator {

    private StringAddCalculator() { }

    public static int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0; // 빈 문자열은 0 출력
        }
        
        // 구분자에 따른 분리 및 검증
        String[] tokens = InputParser.split(input);
        InputValidator.validateTokens(tokens);
        
        long sum = 0L;
        for(String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return (int) sum;
    }
}
