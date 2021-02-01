package org.example.consumer;

import com.rabbitmq.client.*;
import org.example.connection.RabbitMQConnection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MainConsumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = RabbitMQConnection.getConnection();
        Channel channel = connection.createChannel();
        channel.basicConsume("unnamed", new DefaultConsumer(channel));
        channel.close();
        connection.close();
    }
}
