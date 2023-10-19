package com.certacon.poc.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_DOCUMENTOS")
public class Document implements Serializable {
     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private UUID idDocumento;
     private String Numero;
     private String Campo;
     @Column(columnDefinition = "TEXT")
     private String Descricao;
     private String Tipo;
     private String Tamanho;
     private String Decimais;
     private String Entrada;
     private String Saida;

     public UUID getIdDocumento() {
          return idDocumento;
     }

     public void setIdDocumento(UUID id) {
          this.idDocumento = id;
     }

     public String getNumero() {
          return Numero;
     }

     public void setNumero(String numero) {
          Numero = numero;
     }

     public String getCampo() {
          return Campo;
     }

     public void setCampo(String campo) {
          Campo = campo;
     }

     public String getDescricao() {
          return Descricao;
     }

     public void setDescricao(String descricao) {
          Descricao = descricao;
     }

     public String getTipo() {
          return Tipo;
     }

     public void setTipo(String tipo) {
          Tipo = tipo;
     }

     public String getTamanho() {
          return Tamanho;
     }

     public void setTamanho(String tamanho) {
          Tamanho = tamanho;
     }

     public String getDecimais() {
          return Decimais;
     }

     public void setDecimais(String decimais) {
          Decimais = decimais;
     }

     public String getEntrada() {
          return Entrada;
     }

     public void setEntrada(String entrada) {
          Entrada = entrada;
     }

     public String getSaida() {
          return Saida;
     }

     public void setSaida(String saida) {
          Saida = saida;
     }
}
