package com.example.nio;

import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;


public class BuffersDemo {


    @Test
    public void basicBufferTests(){
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        Assert.assertEquals(0, byteBuffer.position());
        Assert.assertEquals(10, byteBuffer.capacity());
        byteBuffer.put((byte)'a');
        Assert.assertEquals(1, byteBuffer.position());
    }
}
