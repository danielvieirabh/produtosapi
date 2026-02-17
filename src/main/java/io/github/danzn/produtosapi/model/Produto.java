package io.github.danzn.produtosapi.model;


import jakarta.persistence.*;

@Entity
//@Table(name = "tb_produto") //caso o nome no banco seja tb_produto
public class Produto {

    @Column(name = "id") //nao e necessario colocar
    @Id
    private String id;
    
    @Column //Nao e obrigatorio , serve para mapear as colunas do bancco
    private String nome;
    @Column
    private String descricao;
    @Column
    private Double preco;


    public Produto() {

    }

    public Produto(String id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
