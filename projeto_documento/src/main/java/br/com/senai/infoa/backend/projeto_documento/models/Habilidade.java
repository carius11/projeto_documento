package br.com.senai.infoa.backend.projeto_documento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "habilidade")

public class Habilidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "habilidade_id") 
    private Habilidade habilidade;

    @ManyToMany
    @JoinTable(
        name = "habilidade_pessoa",
        joinColumns = @JoinColumn(name = "habilidade_id"),
        inverseJoinColumns = @JoinColumn(name = "pessoa_id")
    )
    private java.util.List<Pessoa> pessoa;

    public Habilidade() {
    }

    public Habilidade(String descricao, Integer id, String nivel, String nome) {
        this.descricao = descricao;
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    


    
}

    
