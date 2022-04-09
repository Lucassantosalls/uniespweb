package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Ator;
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtorService {

    @Autowired
    private AtorRepository repository;

    public Ator salvar(Ator ator ){

        return  repository.save(ator);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Ator> listar(){
        return  repository.findAll();
    }

    public Ator atualizar(Ator ator) throws Exception {
        if(ator.getId()!=null){
            return repository.save(ator);
        }
        throw new Exception("ID Não encontrado!");
    }
}
