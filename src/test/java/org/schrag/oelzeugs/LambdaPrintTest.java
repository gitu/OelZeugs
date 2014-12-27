package org.schrag.oelzeugs;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class LambdaPrintTest {
    public String[] strings = {"A","B","C"};
    @Test
    public void testPrintAll() throws Exception {
        new LambdaPrint().printAll(Arrays.asList(strings));
    }
}