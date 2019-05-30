package linter;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSLinterTest {
    @Test
    public void testGates(){
        JSLinter instanceForTest = new JSLinter();
        int expect = 46;
        assertEquals(expect, instanceForTest.jsLinter("src/main/resources/gates.js"));
    }
    @Test
    public void testNoError(){
        JSLinter instanceForTest = new JSLinter();
        int expect = 0;
        assertEquals(expect, instanceForTest.jsLinter("src/main/resources/noError.js"));
    }
    @Test
    public void testOneError(){
        JSLinter instanceForTest = new JSLinter();
        int expect = 1;
        assertEquals(expect, instanceForTest.jsLinter("src/main/resources/oneError.js"));
    }
    @Test
    public void testFewError(){
        JSLinter instanceForTest = new JSLinter();
        int expect = 4;
        assertEquals(expect, instanceForTest.jsLinter("src/main/resources/fewError.js"));
    }
    @Test
    public void testManyError(){
        JSLinter instanceForTest = new JSLinter();
        int expect = 92;
        assertEquals(expect, instanceForTest.jsLinter("src/main/resources/manyError.js"));
    }
    @Test
    public void testEmpty(){
        JSLinter instanceForTest = new JSLinter();
        int expect = 0;
        assertEquals(expect, instanceForTest.jsLinter("src/main/resources/empty.js"));
    }

}