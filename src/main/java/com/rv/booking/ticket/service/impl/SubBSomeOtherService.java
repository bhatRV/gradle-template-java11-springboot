package com.rv.booking.ticket.service.impl;

import com.rv.booking.ticket.service.SomeOtherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class SubBSomeOtherService implements SomeOtherService {



    @Override
    public boolean supportType(Object type) {
        return true;
    }


}