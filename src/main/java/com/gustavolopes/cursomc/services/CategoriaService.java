package com.gustavolopes.cursomc.services;

import com.gustavolopes.cursomc.domain.Categoria;
import com.gustavolopes.cursomc.repositories.CategoriaRepository;
import com.gustavolopes.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                String.format("Objeto nao encontrado! Id: %d, Tipo: %s", id, Categoria.class.getName())));
    }
}
