package pl.sda.mapper;

import org.mapstruct.Mapper;
import pl.sda.dto.PersonDto;
import pl.sda.model.PersonEntity;

import java.util.List;

@Mapper
public interface PersonMapStructMapper {

    PersonDto map(PersonEntity entity);

    List<PersonDto> map(List<PersonEntity> entities);
}
