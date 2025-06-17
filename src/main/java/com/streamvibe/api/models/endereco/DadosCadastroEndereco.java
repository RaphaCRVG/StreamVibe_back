package com.streamvibe.api.models.endereco;

// Puxa os dados do Imsomnia
public record DadosCadastroEndereco(
    String rua,
    String numero,
    String bairro,
    String cep,
    String cidade,
    String complemento) {
    
}
