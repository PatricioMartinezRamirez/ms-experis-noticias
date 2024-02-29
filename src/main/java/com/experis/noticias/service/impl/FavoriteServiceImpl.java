package com.experis.noticias.service.impl;

import com.experis.noticias.model.FavoriteModel;
import com.experis.noticias.repository.FavoriteRepository;
import com.experis.noticias.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository repo;

    @Override
    public FavoriteModel registrar(FavoriteModel obj) {
        return repo.save(obj);
    }

    @Override
    public FavoriteModel modificar(FavoriteModel obj) {
        return repo.save(obj);
    }

    @Override
    public List<FavoriteModel> listar() {
        return repo.findAll();
    }

    @Override
    public FavoriteModel leerPorId(Long id) {
        Optional<FavoriteModel> op = repo.findById(id);
        return op.isPresent() ? op.get() : new FavoriteModel();
    }
    @Override
    public boolean eliminar(Long id) {
        repo.deleteById(Long.valueOf(id));
        return true;
    }
}
