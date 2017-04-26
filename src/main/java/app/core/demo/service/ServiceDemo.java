package app.core.demo.service;

import app.core.demo.queue.TestMessage;
import core.framework.api.kafka.MessagePublisher;

import javax.inject.Inject;
import java.util.UUID;

/**
 * @author emorales
 */
public class ServiceDemo {
    @Inject
    MessagePublisher<TestMessage> testMessageMessagePublisher;

    public void publish() {
        String key = UUID.randomUUID().toString();
        TestMessage message = new TestMessage();
        message.text = "test";
        testMessageMessagePublisher.publish(key, message);

    }
}
