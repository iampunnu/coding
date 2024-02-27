package com.problem.problemsolving.Serilization;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Arrays;

public class CharReader {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("file.txt");
                PrintStream out = System.out;
        char c[] = new char[10];
        CharBuffer cf = CharBuffer.wrap(c);

        // illustrating markSupported()
        if (r.markSupported()) {
            // illustrating mark()
            r.mark(100);
            out.println(" mark method is supported & quot");
        }
        // skipping 5 characters
        r.skip(5);

        // checking whether this stream is ready to be read.
        if (r.ready()) {
            // illustrating read(char[] cbuf,int off,int
            // len)
            r.read(c, 0, 10);
            out.println(Arrays.toString(c));

            // illustrating read(CharBuffer target )
            r.read(cf);
            out.println(Arrays.toString(cf.array()));

            // illustrating read()
            out.println((char)r.read());
        }
        // closing the stream
        r.close();
    }
}
