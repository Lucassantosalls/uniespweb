package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;


    public Filme salvar(Filme filme){
        return repository.save(filme);
    }

}
