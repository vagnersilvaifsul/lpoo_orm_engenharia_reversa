package br.edu.ifsul.cstsi.lpoo_orm_engenharia_reversa.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Produtos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "descricao", nullable = true, length = 255)
    private String descricao;
    @Basic
    @Column(name = "estoque", nullable = true)
    private Integer estoque;
    @Basic
    @Column(name = "nome", nullable = true, length = 255)
    private String nome;
    @Basic
    @Column(name = "situacao", nullable = true)
    private Boolean situacao;
    @Basic
    @Column(name = "valor", nullable = true, precision = 0)
    private Double valor;
    @OneToMany(mappedBy = "produtosByProdutoId")
    private Collection<Itens> itensById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produtos produtos = (Produtos) o;

        if (id != null ? !id.equals(produtos.id) : produtos.id != null) return false;
        if (descricao != null ? !descricao.equals(produtos.descricao) : produtos.descricao != null) return false;
        if (estoque != null ? !estoque.equals(produtos.estoque) : produtos.estoque != null) return false;
        if (nome != null ? !nome.equals(produtos.nome) : produtos.nome != null) return false;
        if (situacao != null ? !situacao.equals(produtos.situacao) : produtos.situacao != null) return false;
        if (valor != null ? !valor.equals(produtos.valor) : produtos.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (estoque != null ? estoque.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (situacao != null ? situacao.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        return result;
    }

    public Collection<Itens> getItensById() {
        return itensById;
    }

    public void setItensById(Collection<Itens> itensById) {
        this.itensById = itensById;
    }
}
