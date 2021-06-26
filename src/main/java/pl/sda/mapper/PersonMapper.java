package pl.sda.mapper;

import org.springframework.stereotype.Component;
import pl.sda.dto.PersonDto;
import pl.sda.model.PersonEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public List<PersonDto> map(List<PersonEntity> entities) {
        return entities.stream().map(PersonMapper::map).collect(Collectors.toList());
    }

    private static PersonDto map(PersonEntity entity) {
        return new PersonDto(entity.getFirstName(), entity.getLastName(), entity.getAge(), entity.getPesel());
    }
}
