package modifieres;

import helpers.StringSplitter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeStrategy implements Strategy {
    @Override
    public String changeCase(String string) {
        String[] splittedText = StringSplitter.split(string);
        return Arrays.stream(splittedText)
                .map(String::trim)
                .filter(it -> !it.isBlank())
                .map(it -> it.substring(0, 1).toUpperCase() + it.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
