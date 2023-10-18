package com.certacon.poc.inputModels;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CriarDocumentoInputModel(
        @NotNull String Numero,
        @NotBlank String Campo,
        @NotBlank String Descricao,
        @NotBlank String Tipo,
        @NotBlank String Tamanho,
        @NotBlank String Decimais,
        @NotBlank String Entrada,
        @NotBlank String Saida
){
}
