package com.example.szallas.model.request;

import com.example.szallas.model.LeisureActivity;
import com.example.szallas.model.MealOption;
import com.example.szallas.model.ServiceOption;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Data
public class ReszletesKereses {
    private String hova;
    private LocalDate check_in;
    private LocalDate check_out;
    private Integer numberOfPerson;
        private boolean teljesELlatas;
        private boolean felEllatas;
        private boolean wifi;
        private boolean parkolas;
}
