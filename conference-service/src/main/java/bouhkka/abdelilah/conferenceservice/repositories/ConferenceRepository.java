package bouhkka.abdelilah.conferenceservice.repositories;

import bouhkka.abdelilah.conferenceservice.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, String> {
}