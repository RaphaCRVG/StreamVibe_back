package com.streamvibe.api.models.usuario;

import com.streamvibe.api.models.endereco.Endereco;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;

    @Embedded
    private Endereco endereco;
    
    //puxa os dados do DadosCadastroUsuario
    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();
        
    }
}
