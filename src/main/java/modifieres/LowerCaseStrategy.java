package modifieres;

import helpers.StringSplitter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LowerCaseStrategy implements Strategy {
    @Override
    public String changeCase(String string) {
        return Arrays.stream(StringSplitter.split(string))
                .map(String::trim)
                .map(String::toLowerCase)
                .collect(Collectors.joining());

    }
}
