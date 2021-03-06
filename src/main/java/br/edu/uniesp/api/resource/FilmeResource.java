package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;
@CrossOrigin(maxAge = 3000)
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
    public List<Filme> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){

        service.deletar(id);
    }

    @PutMapping()
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);
    }

    @GetMapping("/titulo/{titulo}")
    public List<Filme> listarFilmePorTitulo(@PathVariable String titulo){

        return service.findFilmeByTitulo(titulo);
    }

    @GetMapping("/assistido/")
    public List<Filme> listarPorAssistido(){
        return service.findByAssistido();
    }
}
