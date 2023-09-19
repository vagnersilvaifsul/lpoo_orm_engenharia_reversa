package br.edu.ifsul.cstsi.lpoo_orm_engenharia_reversa.model;

import jakarta.persistence.*;

@Entity
public class Itens {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "quantidade", nullable = true)
    private Integer quantidade;
    @Basic
    @Column(name = "situacao", nullable = true)
    private Boolean situacao;
    @Basic
    @Column(name = "total_item", nullable = true, precision = 0)
    private Double totalItem;
    @Basic
    @Column(name = "pedido_id", nullable = true)
    private Long pedidoId;
    @Basic
    @Column(name = "produto_id", nullable = true)
    private Long produtoId;
    @ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private Pedidos pedidosByPedidoId;
    @ManyToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produtos produtosByProdutoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Double totalItem) {
        this.totalItem = totalItem;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Itens itens = (Itens) o;

        if (id != null ? !id.equals(itens.id) : itens.id != null) return false;
        if (quantidade != null ? !quantidade.equals(itens.quantidade) : itens.quantidade != null) return false;
        if (situacao != null ? !situacao.equals(itens.situacao) : itens.situacao != null) return false;
        if (totalItem != null ? !totalItem.equals(itens.totalItem) : itens.totalItem != null) return false;
        if (pedidoId != null ? !pedidoId.equals(itens.pedidoId) : itens.pedidoId != null) return false;
        if (produtoId != null ? !produtoId.equals(itens.produtoId) : itens.produtoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (quantidade != null ? quantidade.hashCode() : 0);
        result = 31 * result + (situacao != null ? situacao.hashCode() : 0);
        result = 31 * result + (totalItem != null ? totalItem.hashCode() : 0);
        result = 31 * result + (pedidoId != null ? pedidoId.hashCode() : 0);
        result = 31 * result + (produtoId != null ? produtoId.hashCode() : 0);
        return result;
    }

    public Pedidos getPedidosByPedidoId() {
        return pedidosByPedidoId;
    }

    public void setPedidosByPedidoId(Pedidos pedidosByPedidoId) {
        this.pedidosByPedidoId = pedidosByPedidoId;
    }

    public Produtos getProdutosByProdutoId() {
        return produtosByProdutoId;
    }

    public void setProdutosByProdutoId(Produtos produtosByProdutoId) {
        this.produtosByProdutoId = produtosByProdutoId;
    }
}
