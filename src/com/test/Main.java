package com.test;

import java.util.zip.Adler32;
import java.util.zip.CRC32;

public class Main {

    public static void main(String[] args) {
        String input = "Hello World!";

        CRC32 crc32 = new CRC32();//CRC32
        Adler32 adler32 = new Adler32();//Adler32
        crc32.update(input.getBytes());
        adler32.update(input.getBytes());
        System.out.println(input);
        System.out.println("CRC32 - " + Long.toHexString(crc32.getValue()));//выводим в 16 виде
        System.out.println("Adler32 - " + Long.toHexString(adler32.getValue()));//выводим в 16 виде
    }
}
