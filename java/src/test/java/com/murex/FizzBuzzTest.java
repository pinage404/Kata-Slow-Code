/*
Copyright (c) 2021 Murex

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package com.murex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Disabled
    @Test
    public void acceptance_test() {
        // /!\ Should only pass at the end:
        // - Keep disabled
        // - Write and pass intermediate tests
        // - Enable at the end when should be passing

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(90));
        assertEquals("91",       FizzBuzz.fizzBuzz(91));
        assertEquals("92",       FizzBuzz.fizzBuzz(92));
        assertEquals("Fizz",     FizzBuzz.fizzBuzz(93));
        assertEquals("94",       FizzBuzz.fizzBuzz(94));
        assertEquals("Buzz",     FizzBuzz.fizzBuzz(95));
        assertEquals("Fizz",     FizzBuzz.fizzBuzz(96));
        assertEquals("97",       FizzBuzz.fizzBuzz(97));
        assertEquals("98",       FizzBuzz.fizzBuzz(98));
        assertEquals("Fizz",     FizzBuzz.fizzBuzz(99));
        assertEquals("Buzz",     FizzBuzz.fizzBuzz(100));
    }
}
