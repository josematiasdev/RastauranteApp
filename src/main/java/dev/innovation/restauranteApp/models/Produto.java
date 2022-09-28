package dev.innovation.restauranteApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private String nome;
    private Integer quantidade;
    private Double valor;
}
