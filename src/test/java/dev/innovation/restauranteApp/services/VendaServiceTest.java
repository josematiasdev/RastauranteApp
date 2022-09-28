package dev.innovation.restauranteApp.services;

import dev.innovation.restauranteApp.models.Produto;
import junit.framework.TestCase;
import org.junit.Before;

import static org.junit.Assert.*;

public class VendaServiceTest extends TestCase {


    VendaService vendaService;
    Produto produto;

    @Before
    public void setUp() throws Exception {
        vendaService = new VendaService();
        produto = new Produto();
    }

    public void addProduto(){
        produto.setNome("Pizza Peperone");
        vendaService.addProduto(produto);

    }
}