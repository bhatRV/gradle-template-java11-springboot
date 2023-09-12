package com.rv.booking.ticket.factory;

import com.rv.booking.ticket.service.SomeOtherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@AllArgsConstructor
public class PricingFactory {
    private final List<SomeOtherService> someOtherServiceList;

    public SomeOtherService findYourService(final Object ticketType) {

        return someOtherServiceList.stream()
                .filter(service -> service.supportType(ticketType))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
}
