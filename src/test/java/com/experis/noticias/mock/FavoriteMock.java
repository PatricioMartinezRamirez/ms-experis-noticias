package com.experis.noticias.mock;

import com.experis.noticias.model.FavoriteModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FavoriteMock {

    public static List<FavoriteModel> mockListaFavoritos() {

        List<FavoriteModel> result = new ArrayList<>();
        FavoriteModel model = new FavoriteModel();

        model.setId(1L);
        model.setTitle("Noticia favorita 1");
        model.setImage_url("url noticia 1");
        model.setPublished_at(new Date());
        result.add(model);

        model.setId(2L);
        model.setTitle("Noticia favorita 2");
        model.setImage_url("url noticia 2");
        model.setPublished_at(new Date());
        result.add(model);

        model.setId(3L);
        model.setTitle("Noticia favorita 3");
        model.setImage_url("url noticia 3");
        model.setPublished_at(new Date());
        result.add(model);

        return result;

    }

}
