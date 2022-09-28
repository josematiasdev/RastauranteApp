package dev.innovation.restauranteApp.services;

import dev.innovation.restauranteApp.models.Produto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VendaService {
    private List<Produto> produtos;

    public VendaService(){
        this.produtos = new ArrayList<Produto>();
    }
}
