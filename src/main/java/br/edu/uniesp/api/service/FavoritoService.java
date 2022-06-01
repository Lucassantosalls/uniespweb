package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.model.Favoritos;
import br.edu.uniesp.api.repository.CartaoRepository;
import br.edu.uniesp.api.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritoService {

    @Autowired
    private FavoritoRepository repository;

    public Favoritos salvar(Favoritos favoritos){

        return repository.save(favoritos);
    }

    public void deletar(int id){

        repository.deleteById(id);
    }

    public List<Favoritos> listar(){

        return repository.findAll();
    }

    public Favoritos atualizar(Favoritos favoritos) throws Exception {
        if(favoritos.getId()!=null){
            return repository.save(favoritos);
        }
        throw new Exception("ID Não encontrado!");
    }
}
