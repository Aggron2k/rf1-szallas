package com.example.szallas.model.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReservationRequest {
    private String checkinDate;
    private String checkoutDate;
    private int accomodationId;
}
