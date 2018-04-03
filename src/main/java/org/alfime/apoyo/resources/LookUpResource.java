package org.alfime.apoyo.resources;

import org.alfime.apoyo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LookUpResource {
    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private EstadoCivilRepository estadoCivilRepository;

    @Autowired
    private CiudadRepository ciudadRepository;

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private BarrioRepository barrioRepository;

    @Autowired
    private EscolaridadRepository escolaridadRepository;

    @GetMapping("/generos")
    public List<Genero> retrieveAllGeneros() {
        return generoRepository.findAll();
    }

    @GetMapping("/ciudades")
    public List<Ciudad> retrieveAllCiudades() {
        return ciudadRepository.findAll();
    }

    @GetMapping("/ciudades/{departamento}")
    public List<Ciudad> retrieveAllCiudadesByDepartamento(@PathVariable("departamento") Byte id) {
        return ciudadRepository.findCiudadByDepartamentoId(id);
    }

    @GetMapping("/estados-civiles")
    public List<EstadoCivil> retrieveAllEstadosCiviles() {
        return estadoCivilRepository.findAll();
    }

    @GetMapping("/departamentos")
    public List<Departamento> retrieveAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    @GetMapping("/barrios")
    public List<Barrio> retrieveAllBarrios() {
        return barrioRepository.findAll();
    }

    @GetMapping("/escolaridades")
    public List<Escolaridad> retrieveAllEscolaridades() {
        return escolaridadRepository.findAll();
    }
}
