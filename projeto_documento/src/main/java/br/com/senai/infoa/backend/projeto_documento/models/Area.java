package br.com.senai.infoa.backend.projeto_documento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name = "area")

public class Area{
   
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}