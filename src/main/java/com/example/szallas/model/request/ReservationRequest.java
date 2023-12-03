package com.example.szallas.model.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
@Setter
public class ReservationRequest {
    @NotEmpty(message = "Az érkezés dátuma kötelező.")
    private String checkInDate;

    @NotEmpty(message = "A távozás dátuma kötelező.")
    private String checkOutDate;

    @NotNull(message = "A főszám megadása kötelező.")
    private Integer numberOfPerson;

    @NotEmpty(message = "A szállás azonosítója kötelező.")
    private String accommodationId;

    @NotEmpty(message = "A vendég azonosítója kötelező.")
    private String customerId;
}
