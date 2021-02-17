package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseStrategyTest {
    UpperCaseStrategy upperCaseStrategy = new UpperCaseStrategy();

    @Test
    void testWithSpaces() {
        String result = upperCaseStrategy.changeCase("test test");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = upperCaseStrategy.changeCase("test   test");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testWithDash() {
        String result = upperCaseStrategy.changeCase("test-test");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testWithMultipleDashes() {
        String result = upperCaseStrategy.changeCase("test-_-test");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testPascalCase() {
        String result = upperCaseStrategy.changeCase("TestTest");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testCamelCase() {
        String result = upperCaseStrategy.changeCase("testTest");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testUpperCase() {
        String result = upperCaseStrategy.changeCase("TESTTEST");
        Assertions.assertEquals("TESTTEST", result);
    }

    @Test
    void testNull() {
        String result = upperCaseStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = upperCaseStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = upperCaseStrategy.changeCase("a");
        Assertions.assertEquals("A", result);
    }

    @Test
    void testTwoCharString() {
        String result = upperCaseStrategy.changeCase("aa");
        Assertions.assertEquals("AA", result);
    }

}
