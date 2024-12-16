package bouhkka.abdelilah.keynoteservice.services;

import bouhkka.abdelilah.keynoteservice.dtos.KeynoteDTO;
import bouhkka.abdelilah.keynoteservice.entities.Keynote;
import bouhkka.abdelilah.keynoteservice.mappers.KeynoteMapper;
import bouhkka.abdelilah.keynoteservice.repositories.KeynoteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class KeynoteServiceImpl implements KeynoteService{

    @Autowired
    private KeynoteRepository keynoteRepository;
    @Override
    public List<KeynoteDTO> getAllKeynotes() {
        List<Keynote> keynotes = keynoteRepository.findAll();
        return keynotes.stream()
                .map(KeynoteMapper.INSTANCE::keynoteToKeynoteDTO)
                .toList();
    }

    @Override
    public Optional<KeynoteDTO> getKeynoteById(String id) {
        return keynoteRepository.findById(id)
                .map(KeynoteMapper.INSTANCE::keynoteToKeynoteDTO);
    }

    @Override
    public KeynoteDTO createKeynote(KeynoteDTO keynoteDTO) {
        Keynote keynote = KeynoteMapper.INSTANCE.keynoteDTOToKeynote(keynoteDTO);
        Keynote savedKeynote = keynoteRepository.save(keynote);
        return KeynoteMapper.INSTANCE.keynoteToKeynoteDTO(savedKeynote);
    }

    @Override
    public void deleteKeynote(String id) {
        keynoteRepository.deleteById(id);
    }

    @Override
    public KeynoteDTO updateKeynote(KeynoteDTO keynoteDTO) {
        return null;
    }
}
