package com.tuling;

import java.nio.ByteBuffer;

public class directMermery {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        for (int i = 0; i < 200; i++) {
            byteBuffer.putInt(i);
        }
        System.out.println();
    }
}
