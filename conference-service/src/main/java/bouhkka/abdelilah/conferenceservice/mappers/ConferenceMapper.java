package bouhkka.abdelilah.conferenceservice.mappers;

import bouhkka.abdelilah.conferenceservice.dtos.ConferenceDTO;
import bouhkka.abdelilah.conferenceservice.entities.Conference;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConferenceMapper {
    ConferenceMapper INSTANCE = Mappers.getMapper(ConferenceMapper.class);
    ConferenceDTO conferenceToConferenceDTO(Conference conference);
    Conference conferenceDTOToConference(ConferenceDTO conferenceDTO);
}
