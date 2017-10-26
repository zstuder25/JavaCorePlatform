package com.zs.inputoutputstreamsandfiles.trywithresource;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException{
        throw new IOException("Exception from saySomething");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Exception from close");
    }
}
