package pl.sda.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.dto.PersonDto;
import pl.sda.mapper.PersonMapper;
import pl.sda.repository.PersonRepository;

import java.util.List;

class PersonBoTest {

    @Test
    void findAll() {
        //given
        PersonRepository personRepository = new PersonRepository();
        PersonMapper personMapper = new PersonMapper();
        PersonBo personBo = new PersonBo(personRepository, personMapper);
        //when
        List<PersonDto> persons = personBo.findAll();
        //then
        Assertions.assertTrue(!persons.isEmpty());
    }
}