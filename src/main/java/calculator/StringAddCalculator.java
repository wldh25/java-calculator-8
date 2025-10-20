package calculator;

public class StringAddCalculator {
    private StringAddCalculator() { }
    public static int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0; // 빈 문자열은 0 출력
        }
        // 예외 처리
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
