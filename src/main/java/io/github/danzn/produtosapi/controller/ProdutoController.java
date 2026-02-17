package io.github.danzn.produtosapi.controller;
import io.github.danzn.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {


    @PostMapping //Enviar dados
    public Produto salvar(@RequestBody Produto produto) { //@RequestBody , E para vir no boody da minha requisicao;
        System.out.println("Produto recebido: " + produto.toString()); //Produto recebido: Produto{descricao='Eu sou o melhor computador que o MAC', id='null', nome='Computador', preco=444.0}
        return produto; //Retonar o objeto produto , ele faz aparecer em json no Postman
    }

}
