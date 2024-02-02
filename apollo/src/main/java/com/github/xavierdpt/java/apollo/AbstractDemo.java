package com.github.xavierdpt.java.apollo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractDemo {

    protected final ObjectMapper objectMapper;
    protected final ObjectWriter objectWriter;
    protected final OutputStream outputStream;

    public AbstractDemo() {
        objectMapper = new ObjectMapper();
        objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
        outputStream = new FilterOutputStream(System.out) {
            @Override
            public void close() throws IOException {
                flush();
            }
        };
    }

    protected void writeJson(ObjectNode json) {
        try {
            this.objectWriter.writeValue(this.outputStream, json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
