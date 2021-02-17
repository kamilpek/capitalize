package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SnakeUpperCaseStrategyTest {
    SnakeUpperCaseStrategy snakeUpperCaseStrategy = new SnakeUpperCaseStrategy();

    @Test
    void testWithSpace() {
        String result = snakeUpperCaseStrategy.changeCase("test test");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = snakeUpperCaseStrategy.changeCase("test   test");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testPascalCase() {
        String result = snakeUpperCaseStrategy.changeCase("TestTest");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testCamelCase() {
        String result = snakeUpperCaseStrategy.changeCase("testTest");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testKebabCase() {
        String result = snakeUpperCaseStrategy.changeCase("TEST_TEST");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testMultipleDashesKebabCase() {
        String result = snakeUpperCaseStrategy.changeCase("test--test");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testSnakeKebabMixedCase() {
        String result = snakeUpperCaseStrategy.changeCase("test-_-test");
        Assertions.assertEquals("TEST_TEST", result);
    }

    @Test
    void testNull() {
        String result = snakeUpperCaseStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = snakeUpperCaseStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = snakeUpperCaseStrategy.changeCase("a");
        Assertions.assertEquals("A", result);
    }

    @Test
    void testTwoCharString() {
        String result = snakeUpperCaseStrategy.changeCase("aa");
        Assertions.assertEquals("AA", result);
    }
}
