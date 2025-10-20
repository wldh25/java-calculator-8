package calculator.parser;

import calculator.model.Delimiter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParser {
    private static final Pattern CUSTOM_PATTERN = Pattern.compile("^//(.+)\\n(.*)$", Pattern.DOTALL);

    private InputParser() {}

    public static boolean hasCustomDelimiter(String input) {
        return input.startsWith(Delimiter.CUSTOM_PREFIX);
    }

    // 구분자에 따른 조건문
    public static String[] split(String input) {
        if(!hasCustomDelimiter(input)) {
            return input.split(Delimiter.DEFAULT_REGEX, -1);
        }
        // 커스텀 구분자일 때는 해당 구분자만 사용 (기본 구분자 허용 안 함)
        Matcher m = CUSTOM_PATTERN.matcher(input);
        if(!m.matches()) {
            // 형식 오류
            throw  new IllegalArgumentException("Invalid input");
        }
        String rawDelimiter = m.group(1);
        String numbersPart = m.group(2);

        String safe = Pattern.quote(rawDelimiter);
        return numbersPart.split(safe, -1);
    }
}
