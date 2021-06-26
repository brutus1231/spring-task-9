package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorBo {

    private BookBo bookBo;

    @Autowired
    public AuthorBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }
}
