package io.github.danzn.produtosapi.repository;

import io.github.danzn.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> { //String e o tipo do ID

}
