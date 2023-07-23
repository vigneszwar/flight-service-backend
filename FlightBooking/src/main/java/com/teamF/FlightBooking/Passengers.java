package com.teamF.FlightBooking;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Passengers {
    String name;
    int age;
    String gender;
    String email;
}