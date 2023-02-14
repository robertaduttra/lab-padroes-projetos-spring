package one.digitalinnovation.gof.service.impl;

import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;

/* *
* Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
* injetada pelo Spring(via {@link Autowired}). Com isso, como essa classe é um
* {@link Service}, ela será tratada com um <b>Singleton</b>.
*/

import one.digitalinnovation.gof.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: injetar os componetes do spring com @Autowired
    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair interações com subsistemas, provendo interface simples.
    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Fixme
        // buscar cliente por ID, caso exista.
        // verificar se o endereco do cliente ja existe(pelo Cep).
        // caso nao exista, integrar com o ViaCep e persistir o retorno.
        // Alterar cliente, vinculando o endereco(novo ou existente)

    }

    @Override
    public Cliente buscarPorId(Long id) {
        // Fixme
        // buscar cliente por id.
        return null;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Fixme
        // buscar todos os clientes
        return null;
    }

    @Override
    public void deletar(Long id) {
        // Fixme
        // deletar cliente por id.

    }

    @Override
    public void inserir(Cliente cliente) {
        // Fixme
        // verificar se o Endereço do cliente ja existe(pelo Cep)
        // caso nao exista, integrar com o ViaCEP e persistir o retorno.
        // inserir cliente, vinculando o enderecp(novo ou existente).

    }

}