package co.edu.uniquindio.inventariocafe.service;

import co.edu.uniquindio.inventariocafe.entity.VariedadCafe;
import co.edu.uniquindio.inventariocafe.repository.VariedadCafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariedadCafeService {

    private final VariedadCafeRepository variedadCafeRepository;

    public VariedadCafeService(VariedadCafeRepository variedadCafeRepository) {
        this.variedadCafeRepository = variedadCafeRepository;
    }

    public VariedadCafe guardarVariedad(VariedadCafe variedadCafe) {
        return variedadCafeRepository.save(variedadCafe);
    }

    public List<VariedadCafe> listarVariedades() {
        return variedadCafeRepository.findAll();
    }
}