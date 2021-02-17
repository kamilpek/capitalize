package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CamelCaseStrategyTest {
    CamelCaseStrategy camelCaseStrategy = new CamelCaseStrategy();

    @Test
    void testWithSpace() {
        String result = camelCaseStrategy.changeCase("test test");
        Assertions.assertEquals("testTest", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = camelCaseStrategy.changeCase("test   test");
        Assertions.assertEquals("testTest", result);
    }

    @Test
    void testWithOneDash() {
        String result = camelCaseStrategy.changeCase("test-test");
        Assertions.assertEquals("testTest", result);
    }

    @Test
    void testWithMultipleDashes() {
        String result = camelCaseStrategy.changeCase("test-_-test");
        Assertions.assertEquals("testTest", result);
    }

    @Test
    void testCamelCase() {
        String result = camelCaseStrategy.changeCase("testTest");
        Assertions.assertEquals("testTest", result);
    }

    @Test
    void testPascalCase() {
        String result = camelCaseStrategy.changeCase("TestTest");
        Assertions.assertEquals("testTest", result);
    }

    @Test
    void testLowerCase() {
        String result = camelCaseStrategy.changeCase("testtest");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testUpperCase() {
        String result = camelCaseStrategy.changeCase("TESTEST");
        Assertions.assertEquals("testest", result);
    }
    @Test
    void testNull() {
        String result = camelCaseStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = camelCaseStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = camelCaseStrategy.changeCase("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    void testTwoCharString() {
        String result = camelCaseStrategy.changeCase("aa");
        Assertions.assertEquals("aa", result);
    }
}
