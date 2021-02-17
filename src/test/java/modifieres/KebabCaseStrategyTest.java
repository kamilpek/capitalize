package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KebabCaseStrategyTest {
    KebabCaseStrategy kebabCaseStrategy = new KebabCaseStrategy();

    @Test
    void testWithSpace() {
        String result = kebabCaseStrategy.changeCase("test test");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = kebabCaseStrategy.changeCase("test   test");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testPascalCase() {
        String result = kebabCaseStrategy.changeCase("TestTest");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testCamelCase() {
        String result = kebabCaseStrategy.changeCase("testTest");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testKebabCase() {
        String result = kebabCaseStrategy.changeCase("test-test");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testMultipleDashesKebabCase() {
        String result = kebabCaseStrategy.changeCase("test--test");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testSnakeKebabMixedCase() {
        String result = kebabCaseStrategy.changeCase("test-_-test");
        Assertions.assertEquals("test-test", result);
    }

    @Test
    void testNull() {
        String result = kebabCaseStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = kebabCaseStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = kebabCaseStrategy.changeCase("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    void testTwoCharString() {
        String result = kebabCaseStrategy.changeCase("aa");
        Assertions.assertEquals("aa", result);
    }
}
