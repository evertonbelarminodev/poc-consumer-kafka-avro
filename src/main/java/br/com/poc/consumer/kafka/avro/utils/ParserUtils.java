package br.com.poc.consumer.kafka.avro.utils;

import br.com.poc.consumer.kafka.avro.model.DomicileLock;
import org.springframework.stereotype.Component;
import ps.customer.event.avro.DomicileLockChangedEvent;

@Component
public class ParserUtils {

    public DomicileLock convertDomicileLockEventInDomicileLock(DomicileLockChangedEvent domicileLockChangedEvent){
        DomicileLock domicileLock = new DomicileLock();
        domicileLock.setId(domicileLockChangedEvent.getCustomerId());
        domicileLock.setAccountType(domicileLockChangedEvent.getAccountType());
        domicileLock.setChangeDate(domicileLockChangedEvent.getChangeDate());
        domicileLock.setChangeType(domicileLockChangedEvent.getChangeType());
        domicileLock.setCodAccount(domicileLockChangedEvent.getCodAccount());
        domicileLock.setCodAgency(domicileLockChangedEvent.getCodAgency());
        domicileLock.setCreditCardBrand(domicileLockChangedEvent.getCreditCardBrand());
        domicileLock.setPaymentAccount(domicileLockChangedEvent.getPaymentAccount());
        domicileLock.setTransactionType(domicileLockChangedEvent.getTransactionType());
        return domicileLock;
    }
}
