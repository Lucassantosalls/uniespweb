package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Assistidos;
import br.edu.uniesp.api.model.Ator;
import br.edu.uniesp.api.service.AssistidoService;
import br.edu.uniesp.api.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3000)
@RestController
@RequestMapping("/assistido")
public class AssistidoResource {

    @Autowired
    private AssistidoService service;

    @PostMapping
    public Assistidos salvar(@RequestBody Assistidos assistidos){
        assistidos = service.salvar(assistidos);
        return assistidos;
    }

    @GetMapping
    public List<Assistidos> listar(){
        return  service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping()
    public Assistidos atualizar(@RequestBody Assistidos assistidos) throws Exception {
        return service.atualizar(assistidos);
    }
}
