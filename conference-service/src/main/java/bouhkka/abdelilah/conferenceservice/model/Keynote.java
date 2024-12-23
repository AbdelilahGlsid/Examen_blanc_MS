package bouhkka.abdelilah.conferenceservice.model;

import bouhkka.abdelilah.conferenceservice.entities.Conference;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Keynote {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;
}
