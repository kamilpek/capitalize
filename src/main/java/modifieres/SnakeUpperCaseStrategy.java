package modifieres;

import helpers.StringSplitter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SnakeUpperCaseStrategy implements Strategy {
    @Override
    public String changeCase(String string) {
        String[] splittedText = StringSplitter.split(string);
        return Arrays.stream(splittedText)
                .map(String::trim)
                .map(String::toUpperCase)
                .filter(it -> !it.isBlank())
                .collect(Collectors.joining("_"));
    }
}
