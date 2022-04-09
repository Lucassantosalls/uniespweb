package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Ator;
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ator")
public class AtorResource {

    @Autowired
    private AtorService service;

    @PostMapping
    public Ator salvar(@RequestBody Ator ator){
        ator = service.salvar(ator);
        return ator;
    }

    @GetMapping
    public List<Ator> listar(){
        return  service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping()
    public Ator atualizar(@RequestBody Ator ator) throws Exception {
        return service.atualizar(ator);
    }
}
