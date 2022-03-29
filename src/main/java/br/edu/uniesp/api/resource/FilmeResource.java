package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.FilmeRepository;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;


    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return filme;
    }

    @GetMapping
    public String listar(){

        return "Deveria Retornar Lista";
    }

    @DeleteMapping
    public String remover(){

        return "Removendo";
    }

    @PutMapping
    public String atualizar(){

        return "Atualizando";
    }

}
