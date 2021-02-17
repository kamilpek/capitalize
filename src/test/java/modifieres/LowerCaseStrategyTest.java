package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseStrategyTest {
    LowerCaseStrategy lowerCaseStrategy = new LowerCaseStrategy();

    @Test
    void testWithSpace() {
        String result = lowerCaseStrategy.changeCase("test test");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = lowerCaseStrategy.changeCase("test   test");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testWithDash() {
        String result = lowerCaseStrategy.changeCase("test-test");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testWithMultipleDashes() {
        String result = lowerCaseStrategy.changeCase("test-_-test");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testPascalCase() {
        String result = lowerCaseStrategy.changeCase("TestTest");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testCamelCase() {
        String result = lowerCaseStrategy.changeCase("testTest");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testUpperCase() {
        String result = lowerCaseStrategy.changeCase("TESTTEST");
        Assertions.assertEquals("testtest", result);
    }

    @Test
    void testNull() {
        String result = lowerCaseStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = lowerCaseStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = lowerCaseStrategy.changeCase("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    void testTwoCharString() {
        String result = lowerCaseStrategy.changeCase("aa");
        Assertions.assertEquals("aa", result);
    }
}

