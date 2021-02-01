package org.example.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.example.connection.RabbitMQConnection;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

public class MainProducer {

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = RabbitMQConnection.getConnection();
        Channel channel = connection.createChannel();
        String QUEUE_NAME = "unnamed";
        channel.basicPublish("", QUEUE_NAME, null, UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
        channel.close();
        connection.close();
    }
}
