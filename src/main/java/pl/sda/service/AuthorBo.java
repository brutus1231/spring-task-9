package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.model.BookEntity;

import java.math.BigDecimal;
import java.util.List;

@Component
public class AuthorBo {

    private final BookBo bookBo;

    @Autowired
    public AuthorBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }

    public BigDecimal calculateAveragePrice(String pesel) {
        List<BookEntity> books = bookBo.findByAuthor(pesel);
        double value = books.stream().mapToDouble(t-> t.getValue().doubleValue()).average().getAsDouble();
        return BigDecimal.valueOf(value);
    }
}
