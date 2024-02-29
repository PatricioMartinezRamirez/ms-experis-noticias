package com.experis.noticias;

import com.experis.noticias.model.FavoriteModel;
import com.experis.noticias.repository.FavoriteRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class NoticiasApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoticiasApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(FavoriteRepository favoriteRepository) {

        return args -> {
            prepare(favoriteRepository);
        };

    }

    private void prepare(FavoriteRepository favoriteRepository) {

        List<FavoriteModel> favoriteModelList = new ArrayList<>();
        favoriteModelList.add(
                new FavoriteModel(1L, "NASA AND IM AGREE: ODYSSEUS IS A SUCCESS",
                        "https://spacepolicyonline.com/wp-content/uploads/2024/02/Odysseus-landing-300x163.png",
                        new Date()));
        favoriteModelList.add(
                new FavoriteModel(2L, "Leak in ISS Russian Segment Increases, But Not an Immediate Concern",
                        "https://spacepolicyonline.com/wp-content/uploads/2024/01/Crew-8-better-300x167.png",
                        new Date()));
        favoriteRepository.saveAll(favoriteModelList);
    }
}
