package bouhkka.abdelilah.conferenceservice;

import bouhkka.abdelilah.conferenceservice.entities.Conference;
import bouhkka.abdelilah.conferenceservice.repositories.ConferenceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            ConferenceRepository conferenceRepository
    ){
        return args -> {
            List<String> keynotesIds = List.of("KN01","KN02","KN03");
            keynotesIds.forEach(pId->{
                Conference conference = Conference.builder()
                        .titre("conference")
                        .type("Type")
                        .date(LocalDate.now())
                        .duree(new Random().nextInt(20))
                        .nombreInscrits(100)
                        .score(98)
                        .build();
                conferenceRepository.save(conference);

            });
        };
    }
}
