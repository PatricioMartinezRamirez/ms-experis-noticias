package com.experis.noticias.model;


import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "favorite")
public class FavoriteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "El ID único de la noticia", required = true)
    private Long id;

    @Schema(description = "El titulo de la noticia", required = true)
    private String title;

    @Schema(description = "El enlace de imagen de la noticia", required = true)
    private String image_url;

    @Schema(description = "La fecha de publicacion de la noticia", required = true)
    private Date published_at;

    public Object getIdClase() {
        return id;
    }
}
