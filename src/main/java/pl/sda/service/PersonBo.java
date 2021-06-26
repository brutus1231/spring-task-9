package pl.sda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.dto.PersonDto;
import pl.sda.mapper.PersonMapper;
import pl.sda.model.PersonEntity;
import pl.sda.repository.PersonRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonBo {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public List<PersonDto> findAll() {
        List<PersonEntity> entities = personRepository.findAll();
        return personMapper.map(entities);
    }
}
