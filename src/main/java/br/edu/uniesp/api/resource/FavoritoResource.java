package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.model.Favoritos;
import br.edu.uniesp.api.service.CartaoService;
import br.edu.uniesp.api.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3000)
@RestController
@RequestMapping("/favorito")
public class FavoritoResource {

    @Autowired
    private FavoritoService service;

    @PostMapping
    public Favoritos salvar(@RequestBody Favoritos favoritos){
        favoritos = service.salvar(favoritos);
        return favoritos;
    }

    @GetMapping
    public List<Favoritos> listar(){

        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){

        service.deletar(id);
    }

    @PutMapping()
    public Favoritos atualizar(@RequestBody Favoritos favoritos) throws Exception {
        return service.atualizar(favoritos);
    }
}
