package bouhkka.abdelilah.keynoteservice.mappers;

import bouhkka.abdelilah.keynoteservice.dtos.KeynoteDTO;
import bouhkka.abdelilah.keynoteservice.entities.Keynote;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface KeynoteMapper {
    KeynoteMapper INSTANCE = Mappers.getMapper(KeynoteMapper.class);
    KeynoteDTO keynoteToKeynoteDTO(Keynote keynote);
    Keynote keynoteDTOToKeynote(KeynoteDTO keynoteDTO);
}
