package com.example.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityScan("com.example.demo.model")
@Entity //Indica que esta classe é uma entidade JPA
@Data // Adiciona os metodos getters e setters automatiucamente
@AllArgsConstructor //Adciona um construtor com todos os campos
@NoArgsConstructor //Cria um construtor vazio

public class Produto {

    @Id //Define o campo "id" como chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    private Long id; 
    private String name;
    private String description;

}