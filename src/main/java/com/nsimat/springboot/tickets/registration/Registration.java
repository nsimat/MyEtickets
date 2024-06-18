package com.nsimat.springboot.tickets.registration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Registration(
        Integer id,
        @NotNull(message = "product id is required!")
        Integer productId,
        String ticketCode,
        @NotBlank(message = "Attendee name is required!")
        String attendeeName) {
}
