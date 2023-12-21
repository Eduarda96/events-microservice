package com.bortoletti.eventsmicroservice.domain;

import com.bortoletti.eventsmicroservice.dto.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "events")
@Table(name = "events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDTO eventRequestDTO) {
        this.date = eventRequestDTO.date();
        this.maxParticipants = eventRequestDTO.maxParticipants();
        this.registeredParticipants = eventRequestDTO.registeredParticipants();
        this.title = eventRequestDTO.title();
        this.description = eventRequestDTO.description();
    }
}
