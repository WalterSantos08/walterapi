package com.example.walterapi.dto;

import lombok.Data;

@Data
public class LivroDTO {
    private Long id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String isbn;
}
