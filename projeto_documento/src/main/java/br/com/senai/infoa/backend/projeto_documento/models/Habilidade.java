package br.com.senai.infoa.backend.projeto_documento.models;

import java.util.List;

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
    @JoinColumn(name = "area_id") 
    private Area area;

    @ManyToMany
    @JoinTable(
        name = "habilidade_pessoa",
        joinColumns = @JoinColumn(name = "habilidade_id"),
        inverseJoinColumns = @JoinColumn(name = "pessoa_id")
    )
    private java.util.List<Pessoa> pessoas;

    public Habilidade() {
    }

    public Habilidade(Area area, String descricao, Integer id, String nome, List<Pessoa> pessoas) {
        this.area = area;
        this.descricao = descricao;
        this.id = id;
        this.nome = nome;
        this.pessoas = pessoas;
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public java.util.List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(java.util.List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    
    
}

    
