package bouhkka.abdelilah.keynoteservice.repositories;

import bouhkka.abdelilah.keynoteservice.entities.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeynoteRepository extends JpaRepository<Keynote, String> {
}