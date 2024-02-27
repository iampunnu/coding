package com.problem.problemsolving;


import java.io.*;

public class StringMain {

    public static void main(String[] args) throws IOException {
        try {
            // Writing binary data to a file using
            // OutputStream
            byte[] data = { 3, 8 };
            OutputStream os
                    = new FileOutputStream("kola.bin");
            os.write(data);
            os.close();
            // Reading binary data from a file using
            // InputStream
            InputStream is
                    = new FileInputStream("kola.bin");
            byte[] Buffer = new byte[5];
            is.read(Buffer);
            is.close();
            // Printing the read data
            for (byte b : Buffer) {
                System.out.println(b);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
