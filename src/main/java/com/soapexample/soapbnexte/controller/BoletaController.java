package com.soapexample.soapbnexte.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soapexample.soapbnexte.model.Boleta;

@RestController
public class BoletaController {

    @PostMapping("/consultarBoleta")
    public Boleta consultarBoleta(@RequestBody int numero) {
        // Aquí deberías implementar la lógica para obtener los datos de la boleta según el número proporcionado.
        Boleta boleta = new Boleta();
        boleta.setNombre("Nombre de la boleta");
        boleta.setPrecio(100.0);
        boleta.setMonto(90.0);
        return boleta;
    }
}