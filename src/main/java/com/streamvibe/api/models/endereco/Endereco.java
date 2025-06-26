package com.streamvibe.api.models.endereco;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Endereco {
    
    private int id;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;

    // Puxa os dados do DadosCadastroEndereco
    public Endereco(DadosCadastroEndereco dados) {

        this.rua = dados.rua();
        this.numero = dados.numero();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();

    }

}
