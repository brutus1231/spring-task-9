package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class BookEntity {

    private String title;
    private BigDecimal value;
}
