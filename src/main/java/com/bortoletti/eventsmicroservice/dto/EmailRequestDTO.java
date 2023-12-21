package com.bortoletti.eventsmicroservice.dto;

public record EmailRequestDTO(String to, String subject, String body) {
}
