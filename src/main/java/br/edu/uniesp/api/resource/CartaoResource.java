package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(maxAge = 3000)
@RestController
@RequestMapping("/cartao")
public class CartaoResource {

    @Autowired
    private CartaoService service;

    @PostMapping
    public Cartao salvar(@RequestBody Cartao cartao){
        cartao = service.salvar(cartao);
        return cartao;
    }

    @GetMapping
    public List<Cartao> listar(){

        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable long id){

        service.deletar(id);
    }

    @PutMapping()
    public Cartao atualizar(@RequestBody Cartao cartao) throws Exception {
        return service.atualizar(cartao);
    }
}
