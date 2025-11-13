package com.gustavolopes.cursomc.services;

import com.gustavolopes.cursomc.domain.Pedido;
import com.gustavolopes.cursomc.repositories.PedidoRepository;
import com.gustavolopes.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                String.format("Objeto nao encontrado! Id: %d, Tipo: %s", id, Pedido.class.getName())));
    }
}
