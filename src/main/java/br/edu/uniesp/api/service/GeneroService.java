package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero ){

        return  repository.save(genero);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Genero> listar(){
        return  repository.findAll();
    }

    public Genero atualizar(Genero genero) throws Exception {
        if(genero.getId()!=null){
            return repository.save(genero);
        }
        throw new Exception("ID Não encontrado!");
    }
}
