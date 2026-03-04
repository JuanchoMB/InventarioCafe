package co.edu.uniquindio.inventariocafe.controller;

import co.edu.uniquindio.inventariocafe.entity.VariedadCafe;
import co.edu.uniquindio.inventariocafe.service.VariedadCafeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cafes")
public class VariedadCafeController {

    private final VariedadCafeService variedadCafeService;

    public VariedadCafeController(VariedadCafeService variedadCafeService) {
        this.variedadCafeService = variedadCafeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VariedadCafe crearCafe(@RequestBody VariedadCafe variedadCafe) {
        return variedadCafeService.guardarVariedad(variedadCafe);
    }

    @GetMapping
    public List<VariedadCafe> obtenerTodos() {
        return variedadCafeService.listarVariedades();
    }
}