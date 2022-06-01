package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Assistidos;
import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.repository.AssistidosRepository;
import br.edu.uniesp.api.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistidoService {

    @Autowired
    private AssistidosRepository repository;

    public Assistidos salvar(Assistidos assistidos){

        return repository.save(assistidos);
    }

    public void deletar(int id){

        repository.deleteById(id);
    }

    public List<Assistidos> listar(){

        return repository.findAll();
    }

    public Assistidos atualizar(Assistidos assistidos) throws Exception {
        if(assistidos.getId()!=null){
            return repository.save(assistidos);
        }
        throw new Exception("ID Não encontrado!");
    }
}
