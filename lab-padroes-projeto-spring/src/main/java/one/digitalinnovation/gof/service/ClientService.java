package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.stereotype.Service;

public interface ClientService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long Id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
