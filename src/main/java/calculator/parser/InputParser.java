package calculator.parser;

import calculator.model.Delimiter;

public class InputParser {
    private InputParser() {}

    // 기본 구분자 (, :)로만 분리하는 로직
    public static String[] splitByDefault(String input) {
        return input.split(Delimiter.DEFAULT_REGEX, -1);
    }
}
