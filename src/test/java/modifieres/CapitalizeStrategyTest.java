package modifieres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CapitalizeStrategyTest {
    CapitalizeStrategy capitalizeStrategy = new CapitalizeStrategy();

    @Test
    void testWithSpace() {
        String result = capitalizeStrategy.changeCase("test test");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testWithMultipleSpaces() {
        String result = capitalizeStrategy.changeCase("test   test");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testWithDash() {
        String result = capitalizeStrategy.changeCase("test-test");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testWithMultipleDashes() {
        String result = capitalizeStrategy.changeCase("test-_-test");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testPascalCase() {
        String result = capitalizeStrategy.changeCase("TestTest");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testCamelCase() {
        String result = capitalizeStrategy.changeCase("testTest");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testIdentical() {
        String result = capitalizeStrategy.changeCase("Test Test");
        Assertions.assertEquals("Test Test", result);
    }

    @Test
    void testUpperCase() {
        String result = capitalizeStrategy.changeCase("TESTTEST");
        Assertions.assertEquals("Testtest", result);
    }

    @Test
    void testLowerCase() {
        String result = capitalizeStrategy.changeCase("testtest");
        Assertions.assertEquals("Testtest", result);
    }

    @Test
    void testNull() {
        String result = capitalizeStrategy.changeCase(null);
        Assertions.assertEquals("", result);
    }

    @Test
    void testEmptyString() {
        String result = capitalizeStrategy.changeCase("");
        Assertions.assertEquals("", result);
    }

    @Test
    void testOneCharString() {
        String result = capitalizeStrategy.changeCase("a");
        Assertions.assertEquals("A", result);
    }

    @Test
    void testTwoCharString() {
        String result = capitalizeStrategy.changeCase("aa");
        Assertions.assertEquals("Aa", result);
    }

}
