package br.edu.ifsul.cstsi.lpoo_orm_engenharia_reversa.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
public class Pedidos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "data_criacao", nullable = true)
    private Date dataCriacao;
    @Basic
    @Column(name = "data_modificacao", nullable = true)
    private Date dataModificacao;
    @Basic
    @Column(name = "estado", nullable = true)
    private Byte estado;
    @Basic
    @Column(name = "forma_pagamento", nullable = true, length = 255)
    private String formaPagamento;
    @Basic
    @Column(name = "situacao", nullable = true)
    private Boolean situacao;
    @Basic
    @Column(name = "total_pedido", nullable = true, precision = 0)
    private Double totalPedido;
    @Basic
    @Column(name = "cliente_id", nullable = true)
    private Long clienteId;
    @OneToMany(mappedBy = "pedidosByPedidoId")
    private Collection<Itens> itensById;
    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Clientes clientesByClienteId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pedidos pedidos = (Pedidos) o;

        if (id != null ? !id.equals(pedidos.id) : pedidos.id != null) return false;
        if (dataCriacao != null ? !dataCriacao.equals(pedidos.dataCriacao) : pedidos.dataCriacao != null) return false;
        if (dataModificacao != null ? !dataModificacao.equals(pedidos.dataModificacao) : pedidos.dataModificacao != null)
            return false;
        if (estado != null ? !estado.equals(pedidos.estado) : pedidos.estado != null) return false;
        if (formaPagamento != null ? !formaPagamento.equals(pedidos.formaPagamento) : pedidos.formaPagamento != null)
            return false;
        if (situacao != null ? !situacao.equals(pedidos.situacao) : pedidos.situacao != null) return false;
        if (totalPedido != null ? !totalPedido.equals(pedidos.totalPedido) : pedidos.totalPedido != null) return false;
        if (clienteId != null ? !clienteId.equals(pedidos.clienteId) : pedidos.clienteId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataCriacao != null ? dataCriacao.hashCode() : 0);
        result = 31 * result + (dataModificacao != null ? dataModificacao.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (formaPagamento != null ? formaPagamento.hashCode() : 0);
        result = 31 * result + (situacao != null ? situacao.hashCode() : 0);
        result = 31 * result + (totalPedido != null ? totalPedido.hashCode() : 0);
        result = 31 * result + (clienteId != null ? clienteId.hashCode() : 0);
        return result;
    }

    public Collection<Itens> getItensById() {
        return itensById;
    }

    public void setItensById(Collection<Itens> itensById) {
        this.itensById = itensById;
    }

    public Clientes getClientesByClienteId() {
        return clientesByClienteId;
    }

    public void setClientesByClienteId(Clientes clientesByClienteId) {
        this.clientesByClienteId = clientesByClienteId;
    }
}
