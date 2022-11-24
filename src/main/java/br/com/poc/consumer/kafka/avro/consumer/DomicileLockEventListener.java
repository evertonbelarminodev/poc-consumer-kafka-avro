package br.com.poc.consumer.kafka.avro.consumer;

import br.com.poc.consumer.kafka.avro.model.DomicileLock;
import br.com.poc.consumer.kafka.avro.utils.ParserUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ps.customer.event.avro.DomicileLockChangedEvent;

import java.io.IOException;

/**
 * @author ebelarmino
 *
 */
@Component
public class DomicileLockEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(DomicileLockEventListener.class);

    @Autowired
    private ParserUtils parserUtils;

    @KafkaListener(topics = "${spring.topic.domicilelock.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(DomicileLockChangedEvent domicileLockChangedEvent) throws IOException {
        try {
            DomicileLock message = parserUtils.convertDomicileLockEventInDomicileLock(domicileLockChangedEvent);
            System.out.println(message);
        } catch (Exception ex) {
            LOG.error("Error to send message:", ex.getMessage());
            throw ex;
        }
    }
}
