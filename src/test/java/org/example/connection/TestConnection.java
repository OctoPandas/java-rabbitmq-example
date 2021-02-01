package org.example.connection;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class TestConnection {
    @Test
    public void test01() throws IOException, TimeoutException {
        System.out.println(RabbitMQConnection.getConnection());
    }
}
