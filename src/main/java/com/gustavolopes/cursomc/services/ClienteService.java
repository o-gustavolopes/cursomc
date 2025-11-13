package com.gustavolopes.cursomc.services;

import com.gustavolopes.cursomc.domain.Cliente;
import com.gustavolopes.cursomc.repositories.ClienteRepository;
import com.gustavolopes.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                String.format("Objeto nao encontrado! Id: %d, Tipo: %s", id, Cliente.class.getName())));
    }
}
