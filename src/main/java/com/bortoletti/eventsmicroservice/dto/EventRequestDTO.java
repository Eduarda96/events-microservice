package com.bortoletti.eventsmicroservice.dto;

public record EventRequestDTO(int maxParticipants, int registeredParticipants,
                              String date, String title, String description) {
}
