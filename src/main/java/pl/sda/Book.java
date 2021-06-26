package pl.sda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Book {

    private String title;
    private BigDecimal value;
}
