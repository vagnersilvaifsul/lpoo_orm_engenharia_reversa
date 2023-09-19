package br.edu.ifsul.cstsi.lpoo_orm_engenharia_reversa.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Clientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "nome", nullable = true, length = 255)
    private String nome;
    @Basic
    @Column(name = "situacao", nullable = true)
    private Boolean situacao;
    @Basic
    @Column(name = "sobrenome", nullable = true, length = 255)
    private String sobrenome;
    @OneToMany(mappedBy = "clientesByClienteId")
    private Collection<Pedidos> pedidosById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clientes clientes = (Clientes) o;

        if (id != null ? !id.equals(clientes.id) : clientes.id != null) return false;
        if (nome != null ? !nome.equals(clientes.nome) : clientes.nome != null) return false;
        if (situacao != null ? !situacao.equals(clientes.situacao) : clientes.situacao != null) return false;
        if (sobrenome != null ? !sobrenome.equals(clientes.sobrenome) : clientes.sobrenome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (situacao != null ? situacao.hashCode() : 0);
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        return result;
    }

    public Collection<Pedidos> getPedidosById() {
        return pedidosById;
    }

    public void setPedidosById(Collection<Pedidos> pedidosById) {
        this.pedidosById = pedidosById;
    }
}
