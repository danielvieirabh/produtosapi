package io.github.danzn.produtosapi.controller;
import io.github.danzn.produtosapi.model.Produto;
import io.github.danzn.produtosapi.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping //Enviar dados
    public Produto salvar(@RequestBody Produto produto) { //@RequestBody , E para vir no boody da minha requisicao;
        System.out.println("Produto recebido: " + produto.toString()); //Produto recebido: Produto{descricao='Eu sou o melhor computador que o MAC', id='null', nome='Computador', preco=444.0}
        String id = UUID.randomUUID()  .toString(); //Gera um hash de id
        produto.setId(id);

        produtoRepository.save(produto);
        return produto; //Retonar o objeto produto , ele faz aparecer em json no Postman
    }

    

}
