package com.example.lazyinit.service;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class DeadService {

    private final ApplicationEventPublisher eventPublisher;

    public DeadService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }


    public String getDeadState(){
        AvailabilityChangeEvent.publish(this.eventPublisher, "Well I'm so dead", LivenessState.BROKEN);
        return "I'm so not alive";
    }
}
