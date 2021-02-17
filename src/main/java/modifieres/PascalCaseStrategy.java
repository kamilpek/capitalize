package modifieres;

import helpers.StringSplitter;
import org.apache.commons.text.CaseUtils;

public class PascalCaseStrategy implements Strategy {
    @Override
    public String changeCase(String string) {
        String[] splittedText = StringSplitter.split(string);
        return CaseUtils.toCamelCase(String.join(" ", splittedText), true);
    }
}
