package calculator.validator;

public class InputValidator {
    private InputValidator() {}
    public static void validateTokens(String[] tokens) {
        for (String token : tokens) {
            if (token == null || token.isEmpty()) {
                throw  new IllegalArgumentException("Tokens must not be null or empty");
            }
            if (!token.matches("\\d+")) {
                throw  new IllegalArgumentException("Tokens must contain only numbers" + token);
            }
            // 양수만 허용
            if (Integer.parseInt(token) <= 0) {
                throw  new IllegalArgumentException("Tokens must contain only positive integers" + token);
            }
        }
    }
}
