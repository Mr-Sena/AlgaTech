package com.Algaworks.AlgaTech.controller;

import com.Algaworks.AlgaTech.domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setEmail("Claudinho@algaworks.com");
        cliente.setTelefone("555-54321");
        cliente.setNome("Cláudio");

        Cliente cliente2 = new Cliente();
        cliente2.setId(1L);
        cliente2.setEmail("Safire@algaworks.com");
        cliente2.setTelefone("555-54321");
        cliente2.setNome("Safira");

        return Arrays.asList(cliente, cliente2);


    }

}
