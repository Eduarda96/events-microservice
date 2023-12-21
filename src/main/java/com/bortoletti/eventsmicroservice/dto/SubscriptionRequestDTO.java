package com.bortoletti.eventsmicroservice.dto;

import com.bortoletti.eventsmicroservice.domain.Event;

public record SubscriptionRequestDTO(String participantEmail) {
}
