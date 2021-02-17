package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SnakeCaseStrategyTest {
    SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();

    @Test
    void testWithSpace() {
        String result = snakeCaseStrategy.changeCase("test test");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = snakeCaseStrategy.changeCase("test   test");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testPascalCase() {
        String result = snakeCaseStrategy.changeCase("TestTest");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testCamelCase() {
        String result = snakeCaseStrategy.changeCase("testTest");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testKebabCase() {
        String result = snakeCaseStrategy.changeCase("test_test");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testMultipleDashesKebabCase() {
        String result = snakeCaseStrategy.changeCase("test--test");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testSnakeKebabMixedCase() {
        String result = snakeCaseStrategy.changeCase("test-_-test");
        Assertions.assertEquals("test_test", result);
    }

    @Test
    void testNull() {
        String result = snakeCaseStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = snakeCaseStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = snakeCaseStrategy.changeCase("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    void testTwoCharString() {
        String result = snakeCaseStrategy.changeCase("aa");
        Assertions.assertEquals("aa", result);
    }

}
