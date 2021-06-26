package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AuthorBo {

    private final BookBo bookBo;

    @Autowired
    public AuthorBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }

    BigDecimal calculateAveragePrice(String pesel) {
        BigDecimal result = null;
        return result;
    }
}
