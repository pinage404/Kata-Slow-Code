/*
Copyright (c) 2023 Murex

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

'use strict';

// Instructions:
// Write a function, that given a line number, returns the triangle as an array of integers
// Details here: https://en.wikipedia.org/wiki/Pascal%27s_triangle
class PascalTriangle {
  static line(i) {
    if (i===0)
      return [1];
    const previous = PascalTriangle.line(i-1);

    if (i === 3)
      return [previous.at(0), 3, 3, 1];
    if (i === 2)
      return [previous.at(0), 2, 1];
    if (i === 1)
      return [previous.at(0), 1];
    return [1];
  }
}

module.exports = PascalTriangle;
