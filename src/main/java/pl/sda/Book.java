package pl.sda;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {

    private String title;
    private BigDecimal value;

    public Book(String title, BigDecimal value) {
        this.title = title;
        this.value = value;
    }
}
