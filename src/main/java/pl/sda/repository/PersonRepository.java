package pl.sda.repository;

import org.springframework.stereotype.Repository;
import pl.sda.model.PersonEntity;

import java.util.List;

@Repository
public class PersonRepository {

    public List<PersonEntity> findAll() {
        PersonEntity personEntity = new PersonEntity("Marcin", "Nowak", 20, "PESEL");
        return List.of(personEntity);
    }
}
