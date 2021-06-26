package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class AuthorBo {

    private final BookBo bookBo;

    @Autowired
    public AuthorBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }

    BigDecimal calculateAveragePrice(String pesel) {
        List<Book> books = bookBo.findByAuthor(pesel);
        double value = books.stream().mapToDouble(t-> t.getValue().doubleValue()).average().getAsDouble();
        return BigDecimal.valueOf(value);
    }
}
