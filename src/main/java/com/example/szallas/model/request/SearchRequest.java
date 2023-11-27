package com.example.szallas.model.request;

import com.example.szallas.model.LeisureActivity;
import com.example.szallas.model.MealOption;
import com.example.szallas.model.ServiceOption;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {
    @NotEmpty(message = "Az úticél megadása kötelező.")
    private String hova;
    //Dátumokat validálni kell NotNull annotáció nem jó.
    private LocalDate check_in;
    private LocalDate check_out;
    @NotEmpty(message = "A személyek száma megadása kötelező.")
    private String numberOfPerson;
    private MealOption mealOption;
    private LeisureActivity leisureActivities;
    private ServiceOption serviceOption;
}
