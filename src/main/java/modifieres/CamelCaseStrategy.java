package modifieres;

import helpers.StringSplitter;
import org.apache.commons.text.CaseUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseStrategy implements Strategy {
    @Override
    public String changeCase(String string) {
        String[] splittedText = StringSplitter.split(string);
        return CaseUtils.toCamelCase(String.join(" ", splittedText), false);
    }
}
