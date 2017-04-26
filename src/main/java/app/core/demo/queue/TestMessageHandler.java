package app.core.demo.queue;

import core.framework.api.kafka.MessageHandler;
import core.framework.api.log.ActionLogContext;
import core.framework.api.util.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author emorales
 */
public class TestMessageHandler implements MessageHandler<TestMessage> {
    private final Logger logger = LoggerFactory.getLogger(TestMessageHandler.class);


    @Override
    public void handle(String key, TestMessage message) throws Exception {
        ActionLogContext.put("test-id", key);
        logger.info("message-handling", JSON.toJSON(message));
    }
}
