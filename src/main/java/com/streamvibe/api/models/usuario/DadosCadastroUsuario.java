package com.streamvibe.api.models.usuario;

//puxa os dados do Imsomnia
public record DadosCadastroUsuario(
    String nome,
    String dataNascimento,
    String email,
    String senha,
    String cpf) {
    
}
