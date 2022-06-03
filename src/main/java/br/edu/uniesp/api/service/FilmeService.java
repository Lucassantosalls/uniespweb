package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Assistidos;
import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.AssistidosRepository;
import br.edu.uniesp.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;
    @Autowired
    private AssistidosRepository assistidosRepository;



    public Filme salvar(Filme filme){
        Assistidos assistidos = null;

        if (filme.isAssistido()){
            assistidos.setNomeDoFilme(filme.getTitulo());
            assistidosRepository.save(assistidos);
            return repository.save(filme);
        }else{
            return repository.save(filme);
        }
    }

    public void deletar(int id){

        repository.deleteById(id);
    }

    public List<Filme> listar(){

        return repository.findAll();
    }

    public Filme atualizar(Filme filme) throws Exception {
        if(filme.getId()!=null){
            return repository.save(filme);
        }
        throw new Exception("ID Não encontrado!");
    }

    public List<Filme> findFilmeByTitulo(String titulo){
        return repository.findByTitulo(titulo);
    }

}
