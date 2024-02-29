package com.experis.noticias.repository;

import com.experis.noticias.model.FavoriteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<FavoriteModel, Long> {
}
