package io.github.danzn.produtosapi.repository;

import io.github.danzn.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> { //String e o tipo do ID

    List<Produto> findByNome(String nome);

}
