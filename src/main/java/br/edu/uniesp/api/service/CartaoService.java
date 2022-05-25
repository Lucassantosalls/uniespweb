package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository repository;

    public Cartao salvar(Cartao cartao){

        return repository.save(cartao);
    }

    public void deletar(long id){

        repository.deleteById(id);
    }

    public List<Cartao> listar(){

        return repository.findAll();
    }

    public Cartao atualizar(Cartao cartao) throws Exception {
        if(cartao.getId()!=null){
            return repository.save(cartao);
        }
        throw new Exception("ID Não encontrado!");
    }
}
